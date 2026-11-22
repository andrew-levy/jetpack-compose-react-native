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

// androidx.compose.material3.OutlinedTextField(value: kotlin.String, onValueChange: kotlin.Function1<kotlin.String, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, label: kotlin.Function0<kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, keyboardActions: androidx.compose.foundation.text.KeyboardActions, singleLine: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors)
internal object RendererOutlinedTextField_2 {
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
      (if (node.has("keyboardOptions")) 2048 else 0) +
      (if (node.has("keyboardActions")) 4096 else 0) +
      (if (node.has("singleLine")) 8192 else 0) +
      (if (node.has("maxLines")) 16384 else 0) +
      (if (node.has("minLines")) 32768 else 0) +
      (if (node.has("interactionSource")) 65536 else 0) +
      (if (node.has("shape")) 131072 else 0)
    when (mask / 32) {
      0 -> renderOutlinedTextField_2Group0(node, scope, mask)
      1 -> renderOutlinedTextField_2Group1(node, scope, mask)
      2 -> renderOutlinedTextField_2Group2(node, scope, mask)
      3 -> renderOutlinedTextField_2Group3(node, scope, mask)
      4 -> renderOutlinedTextField_2Group4(node, scope, mask)
      5 -> renderOutlinedTextField_2Group5(node, scope, mask)
      6 -> renderOutlinedTextField_2Group6(node, scope, mask)
      7 -> renderOutlinedTextField_2Group7(node, scope, mask)
      8 -> renderOutlinedTextField_2Group8(node, scope, mask)
      9 -> renderOutlinedTextField_2Group9(node, scope, mask)
      10 -> renderOutlinedTextField_2Group10(node, scope, mask)
      11 -> renderOutlinedTextField_2Group11(node, scope, mask)
      12 -> renderOutlinedTextField_2Group12(node, scope, mask)
      13 -> renderOutlinedTextField_2Group13(node, scope, mask)
      14 -> renderOutlinedTextField_2Group14(node, scope, mask)
      15 -> renderOutlinedTextField_2Group15(node, scope, mask)
      16 -> renderOutlinedTextField_2Group16(node, scope, mask)
      17 -> renderOutlinedTextField_2Group17(node, scope, mask)
      18 -> renderOutlinedTextField_2Group18(node, scope, mask)
      19 -> renderOutlinedTextField_2Group19(node, scope, mask)
      20 -> renderOutlinedTextField_2Group20(node, scope, mask)
      21 -> renderOutlinedTextField_2Group21(node, scope, mask)
      22 -> renderOutlinedTextField_2Group22(node, scope, mask)
      23 -> renderOutlinedTextField_2Group23(node, scope, mask)
      32 -> renderOutlinedTextField_2Group32(node, scope, mask)
      33 -> renderOutlinedTextField_2Group33(node, scope, mask)
      34 -> renderOutlinedTextField_2Group34(node, scope, mask)
      35 -> renderOutlinedTextField_2Group35(node, scope, mask)
      36 -> renderOutlinedTextField_2Group36(node, scope, mask)
      37 -> renderOutlinedTextField_2Group37(node, scope, mask)
      38 -> renderOutlinedTextField_2Group38(node, scope, mask)
      39 -> renderOutlinedTextField_2Group39(node, scope, mask)
      64 -> renderOutlinedTextField_2Group64(node, scope, mask)
      128 -> renderOutlinedTextField_2Group128(node, scope, mask)
      192 -> renderOutlinedTextField_2Group192(node, scope, mask)
      256 -> renderOutlinedTextField_2Group256(node, scope, mask)
      257 -> renderOutlinedTextField_2Group257(node, scope, mask)
      258 -> renderOutlinedTextField_2Group258(node, scope, mask)
      259 -> renderOutlinedTextField_2Group259(node, scope, mask)
      260 -> renderOutlinedTextField_2Group260(node, scope, mask)
      261 -> renderOutlinedTextField_2Group261(node, scope, mask)
      262 -> renderOutlinedTextField_2Group262(node, scope, mask)
      263 -> renderOutlinedTextField_2Group263(node, scope, mask)
      512 -> renderOutlinedTextField_2Group512(node, scope, mask)
      513 -> renderOutlinedTextField_2Group513(node, scope, mask)
      514 -> renderOutlinedTextField_2Group514(node, scope, mask)
      515 -> renderOutlinedTextField_2Group515(node, scope, mask)
      516 -> renderOutlinedTextField_2Group516(node, scope, mask)
      517 -> renderOutlinedTextField_2Group517(node, scope, mask)
      518 -> renderOutlinedTextField_2Group518(node, scope, mask)
      519 -> renderOutlinedTextField_2Group519(node, scope, mask)
      1024 -> renderOutlinedTextField_2Group1024(node, scope, mask)
      1025 -> renderOutlinedTextField_2Group1025(node, scope, mask)
      1026 -> renderOutlinedTextField_2Group1026(node, scope, mask)
      1027 -> renderOutlinedTextField_2Group1027(node, scope, mask)
      1028 -> renderOutlinedTextField_2Group1028(node, scope, mask)
      1029 -> renderOutlinedTextField_2Group1029(node, scope, mask)
      1030 -> renderOutlinedTextField_2Group1030(node, scope, mask)
      1031 -> renderOutlinedTextField_2Group1031(node, scope, mask)
      2048 -> renderOutlinedTextField_2Group2048(node, scope, mask)
      2049 -> renderOutlinedTextField_2Group2049(node, scope, mask)
      4096 -> renderOutlinedTextField_2Group4096(node, scope, mask)
      4097 -> renderOutlinedTextField_2Group4097(node, scope, mask)
      4098 -> renderOutlinedTextField_2Group4098(node, scope, mask)
      4099 -> renderOutlinedTextField_2Group4099(node, scope, mask)
      4100 -> renderOutlinedTextField_2Group4100(node, scope, mask)
      4101 -> renderOutlinedTextField_2Group4101(node, scope, mask)
      4102 -> renderOutlinedTextField_2Group4102(node, scope, mask)
      4103 -> renderOutlinedTextField_2Group4103(node, scope, mask)
      5951 -> renderOutlinedTextField_2Group5951(node, scope, mask)
      7999 -> renderOutlinedTextField_2Group7999(node, scope, mask)
      8063 -> renderOutlinedTextField_2Group8063(node, scope, mask)
      8127 -> renderOutlinedTextField_2Group8127(node, scope, mask)
      8191 -> renderOutlinedTextField_2Group8191(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_2Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      9 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      10 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      11 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      12 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      13 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      14 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      15 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      16 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      17 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      18 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      19 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      20 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      21 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      22 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      23 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      24 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      25 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      26 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      27 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      28 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      29 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      30 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      31 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      33 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      34 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      35 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      36 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      37 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      38 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      39 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      40 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      41 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      42 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      43 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      44 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      45 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      46 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      47 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      48 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      49 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      50 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      51 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      52 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      53 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      54 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      55 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      56 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      57 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      58 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      59 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      60 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      61 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      62 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      63 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      65 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      66 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      67 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      68 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      69 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      70 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      71 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      72 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      73 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      74 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      75 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      76 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      77 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      78 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      79 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      80 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      81 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      82 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      83 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      84 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      85 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      86 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      87 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      88 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      89 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      90 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      91 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      92 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      93 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      94 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      95 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      97 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      98 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      99 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      100 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      101 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      102 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      103 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      104 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      105 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      106 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      107 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      108 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      109 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      110 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      111 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      112 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      113 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      114 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      115 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      116 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      117 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      118 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      119 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      120 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      121 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      122 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      123 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      124 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      125 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      126 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      127 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      129 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      130 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      131 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      132 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      133 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      134 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      135 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      136 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      137 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      138 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      139 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      140 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      141 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      142 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      143 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      144 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      145 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      146 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      147 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      148 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      149 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      150 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      151 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      152 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      153 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      154 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      155 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      156 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      157 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      158 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      159 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      161 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      162 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      163 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      164 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      165 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      166 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      167 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      168 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      169 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      170 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      171 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      172 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      173 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      174 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      175 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      176 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      177 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      178 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      179 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      180 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      181 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      182 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      183 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      184 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      185 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      186 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      187 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      188 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      189 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      190 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      191 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      193 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      194 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      195 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      196 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      197 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      198 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      199 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      200 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      201 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      202 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      203 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      204 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      205 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      206 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      207 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      208 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      209 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      210 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      211 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      212 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      213 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      214 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      215 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      216 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      217 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      218 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      219 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      220 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      221 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      222 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      223 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      225 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      226 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      227 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      228 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      229 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      230 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      231 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      232 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      233 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      234 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      235 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      236 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      237 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      238 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      239 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      241 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      242 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      243 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      244 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      245 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      246 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      247 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      249 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      250 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      251 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      253 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      257 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      258 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      259 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      264 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      265 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      266 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      267 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      272 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      273 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      274 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      275 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      280 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      281 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      282 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      283 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group9(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      288 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      289 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      290 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      291 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      296 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      297 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      298 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      299 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      304 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      305 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      306 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      307 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      312 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      313 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      314 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      315 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group10(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      320 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      321 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      322 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      323 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      328 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      329 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      330 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      331 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      336 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      337 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      338 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      339 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      344 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      345 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      346 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      347 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group11(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      352 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      353 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      354 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      355 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      360 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      361 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      362 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      363 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      368 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      369 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      370 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      371 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      376 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      377 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      378 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      379 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group12(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      384 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      385 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      386 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      387 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      392 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      393 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      394 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      395 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      400 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      401 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      402 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      403 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      408 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      409 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      410 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      411 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group13(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      416 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      417 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      418 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      419 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      424 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      425 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      426 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      427 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      432 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      433 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      434 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      435 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      440 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      441 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      442 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      443 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group14(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      448 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      449 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      450 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      451 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      456 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      457 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      458 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      459 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      464 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      465 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      466 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      467 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      472 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      473 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      474 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      475 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group15(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      480 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      481 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      482 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      483 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      488 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      489 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      490 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      491 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      497 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      498 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      499 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      505 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      513 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      514 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      515 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      520 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      521 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      522 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      523 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      528 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      529 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      530 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      531 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      536 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      537 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      538 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      539 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      545 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      546 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      547 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      552 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      553 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      554 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      555 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      560 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      561 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      562 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      563 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      568 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      569 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      570 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      571 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      577 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      578 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      579 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      584 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      585 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      586 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      587 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      592 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      593 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      594 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      595 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      600 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      601 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      602 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      603 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      609 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      610 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      611 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      616 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      617 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      618 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      619 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      624 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      625 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      626 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      627 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      632 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      633 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      634 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      635 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      641 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      642 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      643 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      648 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      649 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      650 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      651 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      656 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      657 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      658 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      659 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      664 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      665 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      666 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      667 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group21(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      672 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      673 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      674 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      675 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      680 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      681 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      682 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      683 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      688 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      689 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      690 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      691 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      696 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      697 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      698 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      699 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group22(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      704 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      705 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      706 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      707 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      712 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      713 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      714 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      715 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      720 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      721 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      722 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      723 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      728 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      729 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      730 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      731 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group23(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      736 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      737 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      738 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      739 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      744 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      745 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      746 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      747 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      753 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      754 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      755 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      761 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `isError` = node.boolean("isError"),
      )
      1025 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
      )
      1026 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `isError` = node.boolean("isError"),
      )
      1027 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `isError` = node.boolean("isError"),
      )
      1032 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `isError` = node.boolean("isError"),
      )
      1033 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `isError` = node.boolean("isError"),
      )
      1034 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `isError` = node.boolean("isError"),
      )
      1035 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `isError` = node.boolean("isError"),
      )
      1040 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1041 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1042 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1043 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1048 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1049 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1050 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1051 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1056 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1057 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1058 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1059 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1064 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1065 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1066 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1067 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1072 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1073 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1074 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1075 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1080 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1081 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1082 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1083 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1089 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1090 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1091 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1096 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1097 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1098 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1099 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1104 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1105 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1106 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1107 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1112 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1113 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1114 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1115 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group35(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1120 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1121 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1122 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1123 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1128 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1129 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1130 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1131 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1136 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1137 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1138 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1139 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1144 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1145 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1146 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1147 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group36(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1152 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1153 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1154 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1155 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1160 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1161 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1162 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1163 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1168 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1169 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1170 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1171 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1176 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1177 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1178 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1179 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group37(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1184 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1185 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1186 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1187 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1192 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1193 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1194 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1195 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1200 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1201 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1202 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1203 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1208 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1209 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1210 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1211 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group38(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1216 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1217 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1218 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1219 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1224 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1225 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1226 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1227 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1232 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1233 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1234 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1235 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1240 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1241 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1242 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1243 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group39(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1248 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1249 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1250 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1251 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1256 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1257 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1258 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1259 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1265 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1266 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1267 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1273 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group64(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2048 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2049 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2050 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2051 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2056 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2057 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2058 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2059 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2064 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2065 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2066 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2067 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2072 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2073 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2074 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      2075 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group128(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4096 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4097 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4098 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4099 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4104 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4105 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4106 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4107 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4112 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4113 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4114 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4115 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4120 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4121 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4122 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      4123 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group192(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6144 -> androidx.compose.material3.OutlinedTextField(
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
  private fun renderOutlinedTextField_2Group256(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8192 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
      )
      8193 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
      )
      8194 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      8195 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      8200 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8201 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8202 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8203 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8208 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8209 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8210 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8211 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8216 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8217 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8218 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8219 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group257(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8224 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8225 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8226 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8227 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8232 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8233 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8234 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8235 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8240 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8241 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8242 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8243 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8248 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8249 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8250 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8251 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group258(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8256 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8257 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8258 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8259 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8264 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8265 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8266 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8267 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8272 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8273 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8274 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8275 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8280 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8281 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8282 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8283 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group259(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8288 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8289 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8290 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8291 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8296 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8297 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8298 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8299 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8304 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8305 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8306 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8307 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8312 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8313 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8314 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8315 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group260(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8320 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8321 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8322 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8323 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8328 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8329 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8330 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8331 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8336 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8337 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8338 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8339 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8344 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8345 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8346 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8347 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group261(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8352 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8353 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8354 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8355 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8360 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8361 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8362 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8363 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8368 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8369 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8370 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8371 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8376 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8377 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8378 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8379 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group262(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8384 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8385 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8386 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8387 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8392 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8393 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8394 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8395 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8400 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8401 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8402 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8403 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8408 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8409 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8410 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8411 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group263(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8416 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8417 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8418 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8419 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8424 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8425 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8426 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8427 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8432 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8433 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8434 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8435 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8440 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8441 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8442 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      8443 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group512(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16384 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16385 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16386 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16387 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16392 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16393 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16394 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16395 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16400 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16401 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16402 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16403 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16408 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16409 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16410 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16411 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group513(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16416 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16417 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16418 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16419 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16424 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16425 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16426 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16427 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16432 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16433 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16434 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16435 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16440 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16441 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16442 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16443 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group514(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16448 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16449 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16450 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16451 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16456 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16457 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16458 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16459 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16464 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16465 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16466 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16467 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16472 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16473 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16474 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16475 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group515(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16480 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16481 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16482 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16483 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16488 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16489 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16490 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16491 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16496 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16497 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16498 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16499 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16504 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16505 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16506 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16507 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group516(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16512 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16513 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16514 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16515 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16520 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16521 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16522 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16523 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16528 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16529 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16530 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16531 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16536 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16537 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16538 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16539 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group517(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16544 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16545 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16546 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16547 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16552 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16553 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16554 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16555 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16560 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16561 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16562 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16563 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16568 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16569 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16570 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16571 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group518(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16576 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16577 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16578 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16579 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16584 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16585 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16586 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16587 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16592 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16593 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16594 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16595 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16600 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16601 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16602 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16603 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group519(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16608 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16609 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16610 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16611 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16616 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16617 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16618 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16619 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16624 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16625 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16626 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16627 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16632 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16633 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16634 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16635 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group1024(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32768 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      32769 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
      )
      32770 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      32771 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      32776 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32777 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32778 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32779 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32784 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32785 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32786 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32787 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32792 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32793 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32794 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32795 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group1025(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32800 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32801 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32802 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32803 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32808 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32809 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32810 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32811 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32816 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32817 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32818 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32819 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32824 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32825 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32826 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32827 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group1026(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32832 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32833 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32834 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32835 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32840 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32841 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32842 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32843 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32848 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32849 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32850 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32851 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32856 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32857 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32858 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32859 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group1027(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32864 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32865 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32866 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32867 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32872 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32873 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32874 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32875 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32880 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32881 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32882 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32883 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32888 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32889 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32890 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32891 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group1028(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32896 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32897 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32898 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32899 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32904 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32905 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32906 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32907 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32912 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32913 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32914 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32915 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32920 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32921 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32922 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32923 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group1029(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32928 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32929 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32930 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32931 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32936 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32937 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32938 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32939 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32944 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32945 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32946 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32947 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32952 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32953 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32954 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32955 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group1030(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32960 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32961 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32962 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32963 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32968 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32969 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32970 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32971 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32976 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32977 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32978 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32979 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32984 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32985 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32986 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32987 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group1031(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32992 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32993 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32994 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      32995 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33000 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33001 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33002 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33003 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33008 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33009 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33010 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33011 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33016 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33017 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33018 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      33019 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group2048(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65536 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65537 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65538 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65539 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65540 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65541 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65542 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65543 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65544 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65545 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65546 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65547 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65548 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65549 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65550 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65551 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65552 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65553 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65554 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65555 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65556 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65557 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65558 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65559 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65560 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65561 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65562 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65563 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65564 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65565 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65566 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65567 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group2049(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65568 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65569 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65570 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65571 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65572 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65573 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65574 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65575 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65576 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65577 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65578 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65579 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65580 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65581 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65582 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65583 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65584 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65585 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65586 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65587 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65588 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65589 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65590 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65591 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65592 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65593 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65594 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65595 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65596 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65597 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65598 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65599 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group4096(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131072 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      131073 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      131074 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      131075 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      131080 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131081 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131082 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131083 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131088 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131089 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131090 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131091 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131096 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131097 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131098 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131099 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group4097(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131104 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131105 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131106 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131107 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131112 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131113 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131114 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131115 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131120 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131121 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131122 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131123 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131128 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131129 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131130 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131131 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group4098(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131136 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131137 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131138 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131139 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131144 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131145 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131146 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131147 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131152 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131153 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131154 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131155 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131160 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131161 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131162 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131163 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group4099(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131168 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131169 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131170 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131171 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131176 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131177 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131178 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131179 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131184 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131185 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131186 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131187 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131192 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131193 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131194 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131195 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group4100(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131200 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131201 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131202 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131203 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131208 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131209 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131210 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131211 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131216 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131217 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131218 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131219 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131224 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131225 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131226 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131227 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group4101(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131232 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131233 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131234 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131235 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131240 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131241 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131242 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131243 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131248 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131249 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131250 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131251 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131256 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131257 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131258 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131259 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group4102(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131264 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131265 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131266 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131267 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131272 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131273 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131274 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131275 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131280 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131281 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131282 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131283 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131288 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131289 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131290 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131291 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group4103(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131296 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131297 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131298 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131299 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131304 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131305 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131306 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131307 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131312 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131313 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131314 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131315 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131320 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131321 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131322 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      131323 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group5951(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      190459 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
      190463 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group7999(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      255999 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group8063(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      258047 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group8127(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      260095 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
  private fun renderOutlinedTextField_2Group8191(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      262143 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
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
}

// androidx.compose.material3.OutlinedToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.ToggleButtonShapes, colors: androidx.compose.material3.ToggleButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedToggleButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("border")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
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
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.OutlinedToggleButton(
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

// androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedTrailingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("border")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
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
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.TooltipScope) {
    val mask = (if (node.has("caretSize")) 1 else 0) +
      (if (node.has("maxWidth")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("containerColor")) 16 else 0) +
      (if (node.has("tonalElevation")) 32 else 0) +
      (if (node.has("shadowElevation")) 64 else 0)
    when (mask / 32) {
      0 -> renderPlainTooltipGroup0(node, scope, mask)
      1 -> renderPlainTooltipGroup1(node, scope, mask)
      2 -> renderPlainTooltipGroup2(node, scope, mask)
      3 -> renderPlainTooltipGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderPlainTooltipGroup0(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int) {
    when (mask) {
      0 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        content = { RenderComposeChildren(node.children) },
      )
      3 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        content = { RenderComposeChildren(node.children) },
      )
      4 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderPlainTooltipGroup1(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int) {
    when (mask) {
      32 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      33 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      34 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      35 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      36 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      37 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      38 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      39 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      40 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      41 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      42 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      43 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      44 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      45 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      46 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      47 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      48 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      49 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      50 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      51 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      52 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      53 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      54 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      55 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      56 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      57 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      58 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      59 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      60 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      61 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      62 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      63 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderPlainTooltipGroup2(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int) {
    when (mask) {
      64 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      65 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      66 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      67 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      68 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      69 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      70 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      71 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      72 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      73 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      74 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      75 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      76 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      77 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      78 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      79 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      80 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      81 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      82 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      83 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      84 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      85 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      86 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      87 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      88 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      89 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      90 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      91 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      92 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      93 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      94 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      95 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderPlainTooltipGroup3(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int) {
    when (mask) {
      96 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      97 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      98 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      99 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      100 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      101 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      102 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      103 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      104 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      105 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      106 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      107 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      108 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      109 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      110 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      111 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      112 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      113 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      114 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      115 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      116 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      117 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      118 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      119 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      120 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      121 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      122 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      123 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      124 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      125 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      126 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      127 -> scope.composeScoped3(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
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
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("edgePadding")) 4 else 0) +
      (if (node.has("indicator")) 8 else 0) +
      (if (node.has("divider")) 16 else 0) +
      (if (node.has("minTabWidth")) 32 else 0)
    when (mask / 32) {
      0 -> renderPrimaryScrollableTabRowGroup0(node, scope, mask)
      1 -> renderPrimaryScrollableTabRowGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderPrimaryScrollableTabRowGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      1 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      2 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      3 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      4 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      5 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      6 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      7 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      8 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      9 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      10 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      11 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      12 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      13 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      14 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      15 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      16 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      17 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      18 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      19 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      20 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      21 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      22 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      23 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      24 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      25 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      26 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      27 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      28 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      29 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      30 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      31 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderPrimaryScrollableTabRowGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      33 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      34 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      35 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      36 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      37 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      38 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      39 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      40 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      41 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      42 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      43 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      44 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      45 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      46 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      47 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      48 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      49 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      50 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      51 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      52 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      53 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      54 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      55 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      56 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      57 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      58 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      59 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      60 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      61 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      62 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      63 -> androidx.compose.material3.PrimaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
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
      (if (node.has("interactionSource")) 2 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      3 -> androidx.compose.material3.RadioButton(
        `selected` = node.boolean("selected"),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
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
      (if (node.has("startInteractionSource")) 2 else 0) +
      (if (node.has("endInteractionSource")) 4 else 0)
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
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      3 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      4 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      5 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      6 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      7 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
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
      (if (node.has("onValueChangeFinished")) 8 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
