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

// androidx.compose.foundation.text.BasicSecureTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, textStyle: androidx.compose.ui.text.TextStyle, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, cursorBrush: androidx.compose.ui.graphics.Brush, decorator: androidx.compose.foundation.text.input.TextFieldDecorator?, textObfuscationMode: androidx.compose.foundation.text.input.TextObfuscationMode, textObfuscationCharacter: kotlin.Char, scrollState: androidx.compose.foundation.ScrollState)
internal object RendererBasicSecureTextField {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_readOnly(node: ComposeNode) = node.boolean("readOnly")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("inputTransformation")) 4 else 0) +
      (if (node.has("textStyle")) 8 else 0) +
      (if (node.has("keyboardOptions")) 16 else 0) +
      (if (node.has("onKeyboardAction")) 32 else 0) +
      (if (node.has("interactionSource")) 64 else 0) +
      (if (node.has("cursorBrush")) 128 else 0)
    when (mask / 32) {
      0 -> renderBasicSecureTextFieldGroup0(node, scope, mask, stateValue)
      1 -> renderBasicSecureTextFieldGroup1(node, scope, mask, stateValue)
      2 -> renderBasicSecureTextFieldGroup2(node, scope, mask, stateValue)
      3 -> renderBasicSecureTextFieldGroup3(node, scope, mask, stateValue)
      4 -> renderBasicSecureTextFieldGroup4(node, scope, mask, stateValue)
      5 -> renderBasicSecureTextFieldGroup5(node, scope, mask, stateValue)
      6 -> renderBasicSecureTextFieldGroup6(node, scope, mask, stateValue)
      7 -> renderBasicSecureTextFieldGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicSecureTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node))
      3 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node))
      4 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      5 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      6 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      7 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      8 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      9 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      10 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      11 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      16 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      17 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      18 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      19 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      20 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      21 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      22 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      23 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      24 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      25 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      26 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      27 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicSecureTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      32 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      33 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      34 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      35 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      36 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      37 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      38 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      39 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      40 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      41 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      42 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      43 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      48 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      49 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      50 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      51 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      52 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      53 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      54 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      55 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      56 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      57 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      58 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      59 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicSecureTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      64 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      65 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      66 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      67 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      72 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      73 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      74 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      75 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      80 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      81 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      82 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      83 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      88 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      89 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      90 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      91 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicSecureTextFieldGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      96 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      97 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      98 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      99 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      104 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      105 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      106 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      107 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      112 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      113 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      114 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      115 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      120 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      121 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      122 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      123 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicSecureTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      128 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `cursorBrush` = node.arguments().brush("cursorBrush"))
      129 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      130 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      131 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      136 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      137 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      138 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      139 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      144 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      145 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      146 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      147 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      152 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      153 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      154 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      155 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicSecureTextFieldGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      160 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      161 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      162 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      163 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      168 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      169 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      170 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      171 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      176 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      177 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      178 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      179 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      184 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      185 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      186 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      187 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicSecureTextFieldGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      192 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      193 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      194 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      195 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      200 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      201 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      202 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      203 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      208 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      209 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      210 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      211 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      216 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      217 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      218 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      219 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicSecureTextFieldGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      224 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      225 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      226 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      227 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      232 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      233 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      234 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      235 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      240 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      241 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      242 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      243 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      248 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      249 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      250 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      251 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      255 -> androidx.compose.foundation.text.BasicSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.BasicText(text: kotlin.String, modifier: androidx.compose.ui.Modifier, style: androidx.compose.ui.text.TextStyle, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>?, overflow: androidx.compose.ui.text.style.TextOverflow, softWrap: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, color: androidx.compose.ui.graphics.ColorProducer?, autoSize: androidx.compose.foundation.text.TextAutoSize?)
internal object RendererBasicText {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("composeTextStyle")) 1 else 0) +
      (if (node.has("overflow")) 2 else 0) +
      (if (node.has("softWrap")) 4 else 0) +
      (if (node.has("maxLines")) 8 else 0) +
      (if (node.has("minLines")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      2 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      3 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      4 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
      )
      5 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
      )
      6 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      7 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      8 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      9 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      10 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      11 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      12 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      13 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      14 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      15 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      17 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      18 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      19 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      20 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      21 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      22 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      23 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      24 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      25 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      26 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      27 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      28 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      29 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      30 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      31 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.BasicText(text: androidx.compose.ui.text.AnnotatedString, modifier: androidx.compose.ui.Modifier, style: androidx.compose.ui.text.TextStyle, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>?, overflow: androidx.compose.ui.text.style.TextOverflow, softWrap: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, inlineContent: kotlin.collections.Map<kotlin.String, androidx.compose.foundation.text.InlineTextContent>, color: androidx.compose.ui.graphics.ColorProducer?, autoSize: androidx.compose.foundation.text.TextAutoSize?)
internal object RendererBasicText_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("composeTextStyle")) 1 else 0) +
      (if (node.has("overflow")) 2 else 0) +
      (if (node.has("softWrap")) 4 else 0) +
      (if (node.has("maxLines")) 8 else 0) +
      (if (node.has("minLines")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      2 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      3 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      4 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
      )
      5 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
      )
      6 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      7 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      8 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      9 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      10 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      11 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      12 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      13 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      14 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      15 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      16 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      17 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      18 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      19 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      20 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      21 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      22 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      23 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      24 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      25 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      26 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      27 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      28 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      29 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      30 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      31 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.BasicTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, textStyle: androidx.compose.ui.text.TextStyle, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, lineLimits: androidx.compose.foundation.text.input.TextFieldLineLimits, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, cursorBrush: androidx.compose.ui.graphics.Brush, outputTransformation: androidx.compose.foundation.text.input.OutputTransformation?, decorator: androidx.compose.foundation.text.input.TextFieldDecorator?, scrollState: androidx.compose.foundation.ScrollState)
internal object RendererBasicTextField {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_readOnly(node: ComposeNode) = node.boolean("readOnly")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("inputTransformation")) 4 else 0) +
      (if (node.has("textStyle")) 8 else 0) +
      (if (node.has("keyboardOptions")) 16 else 0) +
      (if (node.has("onKeyboardAction")) 32 else 0) +
      (if (node.has("lineLimits")) 64 else 0) +
      (if (node.has("interactionSource")) 128 else 0) +
      (if (node.has("cursorBrush")) 256 else 0) +
      (if (node.has("outputTransformation")) 512 else 0)
    when (mask / 32) {
      0 -> renderBasicTextFieldGroup0(node, scope, mask, stateValue)
      1 -> renderBasicTextFieldGroup1(node, scope, mask, stateValue)
      2 -> renderBasicTextFieldGroup2(node, scope, mask, stateValue)
      3 -> renderBasicTextFieldGroup3(node, scope, mask, stateValue)
      4 -> renderBasicTextFieldGroup4(node, scope, mask, stateValue)
      5 -> renderBasicTextFieldGroup5(node, scope, mask, stateValue)
      6 -> renderBasicTextFieldGroup6(node, scope, mask, stateValue)
      8 -> renderBasicTextFieldGroup8(node, scope, mask, stateValue)
      12 -> renderBasicTextFieldGroup12(node, scope, mask, stateValue)
      13 -> renderBasicTextFieldGroup13(node, scope, mask, stateValue)
      14 -> renderBasicTextFieldGroup14(node, scope, mask, stateValue)
      15 -> renderBasicTextFieldGroup15(node, scope, mask, stateValue)
      16 -> renderBasicTextFieldGroup16(node, scope, mask, stateValue)
      17 -> renderBasicTextFieldGroup17(node, scope, mask, stateValue)
      18 -> renderBasicTextFieldGroup18(node, scope, mask, stateValue)
      19 -> renderBasicTextFieldGroup19(node, scope, mask, stateValue)
      31 -> renderBasicTextFieldGroup31(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node))
      3 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node))
      4 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      5 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      8 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      9 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      10 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      11 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      16 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      17 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      18 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      19 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      20 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      21 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      24 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      25 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      26 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      27 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      32 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      33 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      34 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      35 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      36 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      37 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      40 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      41 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      42 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      43 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      48 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      52 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      53 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      64 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      65 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      66 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      67 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      68 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      69 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      72 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      73 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      74 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      75 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      80 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      84 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      85 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      96 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      100 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      101 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      116 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      117 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      128 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      129 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      130 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      131 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      136 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      137 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      138 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      139 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      144 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      145 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      146 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      147 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      152 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      153 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      154 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      155 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      160 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      161 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      162 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      163 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      168 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      169 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      170 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      171 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      192 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      193 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      194 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      195 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      200 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      201 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      202 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      203 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      256 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `cursorBrush` = node.arguments().brush("cursorBrush"))
      257 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      258 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      259 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      264 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      265 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      266 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      267 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup12(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      384 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      385 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      386 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      387 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      392 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      393 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      394 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      395 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      411 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup13(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      427 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup14(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      459 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup15(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      507 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      511 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      512 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      513 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      516 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      517 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      528 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      529 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      532 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      533 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup17(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      544 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      545 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      548 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      549 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      560 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      561 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      564 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      565 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup18(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      576 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      577 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      580 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      581 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      592 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      593 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      596 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      597 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup19(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      608 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      609 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      612 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      613 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      624 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      625 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      628 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      629 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextFieldGroup31(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      1019 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      1023 -> androidx.compose.foundation.text.BasicTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.BasicTextField(value: androidx.compose.ui.text.input.TextFieldValue, onValueChange: kotlin.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, keyboardActions: androidx.compose.foundation.text.KeyboardActions, singleLine: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, cursorBrush: androidx.compose.ui.graphics.Brush, decorationBox: kotlin.Function1<kotlin.Function0<kotlin.Unit>, kotlin.Unit>)
internal object RendererBasicTextField_1 {
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
      0 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node))
      3 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node))
      4 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      5 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      6 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      7 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      8 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      9 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      10 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      11 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      16 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      17 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      18 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      19 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      24 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node))
      33 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node))
      34 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node))
      35 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node))
      36 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node))
      37 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node))
      38 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node))
      39 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node))
      40 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node))
      41 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node))
      42 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node))
      43 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node))
      48 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node))
      49 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node))
      50 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node))
      51 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node))
      65 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node))
      66 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node))
      67 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node))
      68 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node))
      69 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node))
      70 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node))
      71 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node))
      72 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `maxLines` = decode_maxLines(node))
      73 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `maxLines` = decode_maxLines(node))
      74 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `maxLines` = decode_maxLines(node))
      75 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `maxLines` = decode_maxLines(node))
      80 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `maxLines` = decode_maxLines(node))
      81 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `maxLines` = decode_maxLines(node))
      82 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `maxLines` = decode_maxLines(node))
      83 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      97 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      98 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      99 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      100 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      101 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      102 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      103 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      104 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      105 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      106 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      107 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      112 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      113 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      114 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      115 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node))
      129 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node))
      130 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node))
      131 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node))
      132 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node))
      133 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node))
      134 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node))
      135 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      161 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      162 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      163 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      164 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      165 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      166 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      167 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      193 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      194 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      195 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      196 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      197 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      198 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      199 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      225 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      226 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      227 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      228 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      229 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      230 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      231 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      257 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      264 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      265 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      272 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      273 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      280 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      281 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group9(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      288 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      289 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      296 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      297 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      304 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      305 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      312 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      313 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      513 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      514 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      515 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      516 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      517 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      518 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      519 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      545 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      546 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      547 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      548 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      549 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      550 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      551 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      577 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      578 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      579 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      580 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      581 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      582 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      583 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      609 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      610 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      611 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      612 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      613 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      614 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      615 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      641 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      642 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      643 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      644 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      645 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      646 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      647 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group21(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      672 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      673 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      674 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      675 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      676 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      677 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      678 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      679 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group22(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      704 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      705 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      706 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      707 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      708 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      709 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      710 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      711 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group23(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      736 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      737 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      738 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      739 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      740 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      741 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      742 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      743 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1025 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1026 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1027 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1028 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1029 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1030 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1031 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1056 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1057 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1058 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1059 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1060 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1061 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1062 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1063 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1089 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1090 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1091 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1092 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1093 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1094 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1095 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group35(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1120 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1121 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1122 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1123 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1124 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1125 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1126 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1127 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group36(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1152 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1153 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1154 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1155 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1156 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1157 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1158 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1159 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group37(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1184 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1185 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1186 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1187 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1188 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1189 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1190 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1191 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group38(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1216 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1217 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1218 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1219 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1220 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1221 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1222 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1223 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group39(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1248 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1249 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1250 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1251 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1252 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1253 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1254 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1255 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group48(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1536 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1537 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1538 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1539 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1540 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1541 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1542 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1543 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group49(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1568 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1569 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1570 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1571 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1572 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1573 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1574 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1575 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group50(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1600 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1601 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1602 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1603 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1604 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1605 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1606 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1607 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group51(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1632 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1633 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1634 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1635 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1636 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1637 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1638 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1639 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group52(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1664 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1665 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1666 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1667 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1668 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1669 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1670 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1671 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group53(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1696 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1697 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1698 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1699 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1700 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1701 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1702 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1703 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group54(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1728 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1729 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1730 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1731 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1732 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1733 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1734 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1735 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group55(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1760 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1761 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1762 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1763 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1764 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1765 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1766 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1767 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1775 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1783 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1791 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group63(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2047 -> androidx.compose.foundation.text.BasicTextField(`value` = node.jsonObject("value").toComposeTextFieldValue(), `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

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
      512 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      513 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      514 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      515 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      516 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      517 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      518 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      519 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      545 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      546 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      547 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      548 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      549 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      550 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      551 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      577 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      578 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      579 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      580 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      581 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      582 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      583 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      609 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      610 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      611 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      612 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      613 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      614 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      615 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      641 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      642 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      643 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      644 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      645 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      646 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      647 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group21(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      672 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      673 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      674 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      675 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      676 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      677 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      678 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      679 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group22(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      704 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      705 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      706 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      707 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      708 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      709 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      710 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      711 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group23(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      736 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      737 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      738 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      739 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      740 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      741 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      742 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      743 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1025 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1026 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1027 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1028 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1029 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1030 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1031 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1056 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1057 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1058 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1059 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1060 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1061 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1062 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1063 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1089 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1090 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1091 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1092 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1093 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1094 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1095 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group35(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1120 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1121 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1122 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1123 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1124 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1125 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1126 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1127 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group36(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1152 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1153 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1154 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1155 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1156 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1157 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1158 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1159 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group37(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1184 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1185 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1186 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1187 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1188 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1189 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1190 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1191 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group38(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1216 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1217 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1218 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1219 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1220 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1221 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1222 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1223 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group39(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1248 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1249 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1250 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1251 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1252 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1253 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1254 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1255 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group48(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1536 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1537 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1538 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1539 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1540 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1541 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1542 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1543 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group49(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1568 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1569 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1570 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1571 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1572 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1573 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1574 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1575 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group50(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1600 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1601 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1602 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1603 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1604 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1605 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1606 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1607 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group51(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1632 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1633 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1634 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1635 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1636 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1637 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1638 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1639 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group52(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1664 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1665 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1666 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1667 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1668 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1669 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1670 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1671 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group53(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1696 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1697 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1698 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1699 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1700 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1701 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1702 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1703 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group54(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1728 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1729 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1730 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1731 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1732 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1733 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1734 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1735 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group55(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1760 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1761 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1762 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1763 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1764 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1765 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1766 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1767 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1775 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1783 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      1791 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group63(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2047 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
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
