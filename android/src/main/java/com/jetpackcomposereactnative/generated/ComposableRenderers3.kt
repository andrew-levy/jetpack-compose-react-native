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

// androidx.compose.material3.SearchBarDefaults.InputField(textFieldState: androidx.compose.foundation.text.input.TextFieldState, searchBarState: androidx.compose.material3.SearchBarState, onSearch: kotlin.Function1<kotlin.String, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, outputTransformation: androidx.compose.foundation.text.input.OutputTransformation?, scrollState: androidx.compose.foundation.ScrollState, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererInputField {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val textFieldStateValue = if (node.has("textFieldState") && !node.isNull("textFieldState")) node.jsonObject("textFieldState").rememberComposeTextFieldState() else null
    val searchBarStateValue = if (node.has("searchBarState") && !node.isNull("searchBarState")) node.jsonObject("searchBarState").rememberComposeSearchBarState() else null
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("placeholder")) 8 else 0) +
      (if (node.has("leadingIcon")) 16 else 0) +
      (if (node.has("trailingIcon")) 32 else 0) +
      (if (node.has("prefix")) 64 else 0) +
      (if (node.has("suffix")) 128 else 0) +
      (if (node.has("shape")) 256 else 0) +
      (if (node.has("interactionSource")) 512 else 0)
    when (mask / 32) {
      0 -> renderInputFieldGroup0(node, scope, mask, textFieldStateValue, searchBarStateValue)
      1 -> renderInputFieldGroup1(node, scope, mask, textFieldStateValue, searchBarStateValue)
      2 -> renderInputFieldGroup2(node, scope, mask, textFieldStateValue, searchBarStateValue)
      3 -> renderInputFieldGroup3(node, scope, mask, textFieldStateValue, searchBarStateValue)
      4 -> renderInputFieldGroup4(node, scope, mask, textFieldStateValue, searchBarStateValue)
      5 -> renderInputFieldGroup5(node, scope, mask, textFieldStateValue, searchBarStateValue)
      6 -> renderInputFieldGroup6(node, scope, mask, textFieldStateValue, searchBarStateValue)
      7 -> renderInputFieldGroup7(node, scope, mask, textFieldStateValue, searchBarStateValue)
      8 -> renderInputFieldGroup8(node, scope, mask, textFieldStateValue, searchBarStateValue)
      9 -> renderInputFieldGroup9(node, scope, mask, textFieldStateValue, searchBarStateValue)
      10 -> renderInputFieldGroup10(node, scope, mask, textFieldStateValue, searchBarStateValue)
      11 -> renderInputFieldGroup11(node, scope, mask, textFieldStateValue, searchBarStateValue)
      12 -> renderInputFieldGroup12(node, scope, mask, textFieldStateValue, searchBarStateValue)
      13 -> renderInputFieldGroup13(node, scope, mask, textFieldStateValue, searchBarStateValue)
      14 -> renderInputFieldGroup14(node, scope, mask, textFieldStateValue, searchBarStateValue)
      15 -> renderInputFieldGroup15(node, scope, mask, textFieldStateValue, searchBarStateValue)
      16 -> renderInputFieldGroup16(node, scope, mask, textFieldStateValue, searchBarStateValue)
      17 -> renderInputFieldGroup17(node, scope, mask, textFieldStateValue, searchBarStateValue)
      18 -> renderInputFieldGroup18(node, scope, mask, textFieldStateValue, searchBarStateValue)
      19 -> renderInputFieldGroup19(node, scope, mask, textFieldStateValue, searchBarStateValue)
      20 -> renderInputFieldGroup20(node, scope, mask, textFieldStateValue, searchBarStateValue)
      21 -> renderInputFieldGroup21(node, scope, mask, textFieldStateValue, searchBarStateValue)
      22 -> renderInputFieldGroup22(node, scope, mask, textFieldStateValue, searchBarStateValue)
      23 -> renderInputFieldGroup23(node, scope, mask, textFieldStateValue, searchBarStateValue)
      24 -> renderInputFieldGroup24(node, scope, mask, textFieldStateValue, searchBarStateValue)
      25 -> renderInputFieldGroup25(node, scope, mask, textFieldStateValue, searchBarStateValue)
      26 -> renderInputFieldGroup26(node, scope, mask, textFieldStateValue, searchBarStateValue)
      27 -> renderInputFieldGroup27(node, scope, mask, textFieldStateValue, searchBarStateValue)
      28 -> renderInputFieldGroup28(node, scope, mask, textFieldStateValue, searchBarStateValue)
      29 -> renderInputFieldGroup29(node, scope, mask, textFieldStateValue, searchBarStateValue)
      30 -> renderInputFieldGroup30(node, scope, mask, textFieldStateValue, searchBarStateValue)
      31 -> renderInputFieldGroup31(node, scope, mask, textFieldStateValue, searchBarStateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      0 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      9 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      10 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      11 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      12 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      13 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      14 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      15 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      16 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      17 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      18 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      19 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      20 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      21 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      22 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      23 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      24 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      25 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      26 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      27 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      28 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      29 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      30 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      31 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      32 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      33 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      34 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      35 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      36 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      37 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      38 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      39 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      40 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      41 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      42 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      43 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      44 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      45 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      46 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      47 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      48 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      49 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      50 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      51 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      52 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      53 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      54 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      55 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      56 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      57 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      58 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      59 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      60 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      61 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      62 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      63 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      64 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      65 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      66 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      67 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      68 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      69 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      70 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      71 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      72 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      73 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      74 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      75 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      76 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      77 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      78 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      79 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      80 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      81 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      82 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      83 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      84 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      85 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      86 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      87 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      88 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      89 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      90 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      91 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      92 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      93 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      94 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      95 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup3(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      96 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      97 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      98 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      99 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      100 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      101 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      102 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      103 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      104 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      105 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      106 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      107 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      108 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      109 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      110 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      111 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      112 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      113 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      114 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      115 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      116 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      117 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      118 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      119 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      120 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      121 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      122 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      123 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      124 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      125 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      126 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      127 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      128 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      129 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      130 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      131 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      132 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      133 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      134 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      135 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      136 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      137 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      138 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      139 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      140 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      141 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      142 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      143 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      144 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      145 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      146 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      147 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      148 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      149 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      150 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      151 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      152 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      153 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      154 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      155 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      156 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      157 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      158 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      159 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup5(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      160 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      161 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      162 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      163 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      164 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      165 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      166 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      167 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      168 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      169 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      170 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      171 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      172 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      173 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      174 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      175 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      176 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      177 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      178 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      179 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      180 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      181 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      182 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      183 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      184 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      185 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      186 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      187 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      188 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      189 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      190 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      191 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup6(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      192 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      193 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      194 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      195 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      196 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      197 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      198 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      199 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      200 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      201 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      202 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      203 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      204 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      205 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      206 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      207 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      208 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      209 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      210 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      211 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      212 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      213 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      214 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      215 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      216 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      217 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      218 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      219 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      220 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      221 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      222 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      223 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup7(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      224 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      225 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      226 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      227 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      228 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      229 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      230 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      231 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      232 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      233 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      234 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      235 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      236 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      237 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      238 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      239 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      240 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      241 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      242 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      243 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      244 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      245 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      246 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      247 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      248 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      249 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      250 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      251 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      252 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      253 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      254 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      255 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      256 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      257 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      258 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      259 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      260 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `shape` = node.arguments().shape("shape"),
      )
      261 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `shape` = node.arguments().shape("shape"),
      )
      262 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `shape` = node.arguments().shape("shape"),
      )
      263 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `shape` = node.arguments().shape("shape"),
      )
      264 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      265 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      266 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      267 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      268 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      269 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      270 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      271 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      272 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      273 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      274 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      275 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      276 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      277 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      278 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      279 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      280 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      281 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      282 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      283 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      284 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      285 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      286 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      287 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup9(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      288 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      289 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      290 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      291 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      292 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      293 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      294 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      295 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      296 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      297 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      298 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      299 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      300 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      301 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      302 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      303 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      304 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      305 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      306 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      307 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      308 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      309 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      310 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      311 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      312 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      313 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      314 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      315 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      316 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      317 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      318 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      319 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup10(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      320 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      321 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      322 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      323 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      324 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      325 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      326 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      327 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      328 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      329 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      330 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      331 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      332 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      333 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      334 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      335 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      336 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      337 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      338 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      339 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      340 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      341 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      342 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      343 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      344 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      345 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      346 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      347 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      348 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      349 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      350 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      351 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup11(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      352 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      353 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      354 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      355 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      356 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      357 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      358 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      359 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      360 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      361 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      362 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      363 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      364 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      365 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      366 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      367 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      368 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      369 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      370 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      371 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      372 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      373 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      374 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      375 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      376 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      377 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      378 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      379 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      380 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      381 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      382 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      383 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup12(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      384 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      385 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      386 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      387 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      388 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      389 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      390 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      391 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      392 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      393 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      394 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      395 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      396 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      397 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      398 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      399 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      400 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      401 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      402 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      403 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      404 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      405 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      406 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      407 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      408 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      409 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      410 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      411 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      412 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      413 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      414 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      415 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup13(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      416 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      417 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      418 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      419 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      420 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      421 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      422 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      423 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      424 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      425 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      426 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      427 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      428 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      429 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      430 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      431 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      432 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      433 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      434 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      435 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      436 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      437 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      438 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      439 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      440 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      441 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      442 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      443 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      444 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      445 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      446 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      447 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup14(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      448 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      449 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      450 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      451 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      452 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      453 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      454 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      455 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      456 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      457 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      458 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      459 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      460 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      461 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      462 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      463 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      464 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      465 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      466 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      467 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      468 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      469 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      470 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      471 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      472 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      473 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      474 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      475 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      476 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      477 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      478 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      479 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup15(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      480 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      481 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      482 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      483 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      484 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      485 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      486 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      487 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      488 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      489 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      490 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      491 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      492 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      493 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      494 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      495 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      496 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      497 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      498 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      499 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      500 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      501 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      502 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      503 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      504 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      505 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      506 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      507 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      508 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      509 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      510 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      511 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      512 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      513 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      514 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      515 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      516 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      517 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      518 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      519 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      520 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      521 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      522 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      523 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      524 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      525 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      526 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      527 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      528 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      529 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      530 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      531 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      532 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      533 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      534 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      535 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      536 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      537 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      538 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      539 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      540 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      541 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      542 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      543 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup17(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      544 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      545 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      546 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      547 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      548 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      549 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      550 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      551 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      552 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      553 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      554 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      555 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      556 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      557 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      558 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      559 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      560 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      561 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      562 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      563 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      564 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      565 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      566 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      567 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      568 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      569 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      570 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      571 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      572 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      573 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      574 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      575 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup18(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      576 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      577 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      578 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      579 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      580 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      581 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      582 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      583 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      584 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      585 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      586 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      587 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      588 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      589 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      590 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      591 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      592 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      593 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      594 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      595 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      596 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      597 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      598 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      599 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      600 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      601 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      602 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      603 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      604 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      605 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      606 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      607 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup19(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      608 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      609 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      610 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      611 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      612 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      613 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      614 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      615 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      616 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      617 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      618 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      619 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      620 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      621 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      622 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      623 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      624 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      625 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      626 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      627 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      628 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      629 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      630 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      631 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      632 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      633 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      634 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      635 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      636 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      637 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      638 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      639 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup20(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      640 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      641 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      642 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      643 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      644 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      645 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      646 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      647 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      648 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      649 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      650 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      651 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      652 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      653 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      654 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      655 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      656 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      657 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      658 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      659 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      660 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      661 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      662 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      663 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      664 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      665 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      666 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      667 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      668 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      669 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      670 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      671 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup21(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      672 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      673 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      674 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      675 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      676 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      677 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      678 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      679 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      680 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      681 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      682 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      683 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      684 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      685 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      686 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      687 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      688 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      689 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      690 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      691 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      692 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      693 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      694 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      695 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      696 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      697 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      698 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      699 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      700 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      701 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      702 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      703 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup22(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      704 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      705 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      706 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      707 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      708 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      709 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      710 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      711 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      712 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      713 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      714 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      715 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      716 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      717 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      718 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      719 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      720 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      721 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      722 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      723 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      724 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      725 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      726 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      727 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      728 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      729 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      730 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      731 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      732 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      733 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      734 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      735 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup23(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      736 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      737 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      738 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      739 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      740 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      741 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      742 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      743 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      744 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      745 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      746 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      747 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      748 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      749 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      750 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      751 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      752 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      753 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      754 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      755 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      756 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      757 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      758 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      759 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      760 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      761 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      762 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      763 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      764 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      765 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      766 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      767 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup24(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      768 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      769 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      770 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      771 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      772 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      773 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      774 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      775 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      776 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      777 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      778 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      779 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      780 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      781 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      782 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      783 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      784 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      785 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      786 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      787 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      788 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      789 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      790 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      791 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      792 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      793 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      794 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      795 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      796 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      797 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      798 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      799 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup25(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      800 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      801 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      802 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      803 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      804 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      805 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      806 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      807 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      808 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      809 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      810 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      811 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      812 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      813 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      814 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      815 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      816 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      817 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      818 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      819 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      820 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      821 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      822 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      823 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      824 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      825 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      826 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      827 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      828 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      829 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      830 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      831 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup26(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      832 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      833 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      834 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      835 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      836 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      837 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      838 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      839 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      840 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      841 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      842 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      843 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      844 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      845 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      846 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      847 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      848 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      849 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      850 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      851 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      852 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      853 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      854 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      855 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      856 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      857 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      858 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      859 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      860 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      861 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      862 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      863 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup27(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      864 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      865 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      866 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      867 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      868 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      869 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      870 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      871 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      872 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      873 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      874 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      875 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      876 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      877 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      878 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      879 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      880 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      881 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      882 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      883 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      884 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      885 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      886 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      887 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      888 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      889 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      890 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      891 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      892 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      893 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      894 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      895 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup28(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      896 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      897 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      898 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      899 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      900 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      901 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      902 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      903 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      904 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      905 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      906 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      907 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      908 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      909 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      910 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      911 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      912 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      913 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      914 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      915 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      916 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      917 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      918 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      919 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      920 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      921 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      922 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      923 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      924 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      925 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      926 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      927 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup29(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      928 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      929 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      930 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      931 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      932 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      933 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      934 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      935 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      936 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      937 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      938 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      939 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      940 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      941 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      942 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      943 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      944 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      945 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      946 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      947 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      948 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      949 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      950 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      951 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      952 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      953 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      954 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      955 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      956 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      957 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      958 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      959 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup30(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      960 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      961 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      962 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      963 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      964 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      965 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      966 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      967 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      968 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      969 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      970 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      971 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      972 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      973 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      974 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      975 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      976 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      977 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      978 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      979 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      980 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      981 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      982 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      983 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      984 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      985 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      986 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      987 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      988 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      989 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      990 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      991 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup31(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
      992 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      993 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      994 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      995 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      996 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      997 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      998 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      999 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1000 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1001 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1002 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1003 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1004 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1005 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1006 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1007 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1008 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1009 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1010 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1011 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1012 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1013 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1014 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1015 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1016 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1017 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1018 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1019 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1020 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1021 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1022 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      1023 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `textFieldState` = requireNotNull(textFieldStateValue),
        `searchBarState` = requireNotNull(searchBarStateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
