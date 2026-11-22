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

// androidx.compose.material3.SearchBarDefaults.InputField(query: kotlin.String, onQueryChange: kotlin.Function1<kotlin.String, kotlin.Unit>, onSearch: kotlin.Function1<kotlin.String, kotlin.Unit>, expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.TextFieldColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererInputField_2 {
  private fun decode_query(node: ComposeNode) = node.string("query")
  private fun decode_expanded(node: ComposeNode) = node.boolean("expanded")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val content_placeholder: @Composable () -> Unit = { RenderComposeChildren(node.slot("placeholder")) }
    val slot_placeholder = if (node.isNull("placeholder")) null else content_placeholder
    val content_leadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingIcon")) }
    val slot_leadingIcon = if (node.isNull("leadingIcon")) null else content_leadingIcon
    val content_trailingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingIcon")) }
    val slot_trailingIcon = if (node.isNull("trailingIcon")) null else content_trailingIcon
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("placeholder")) 2 else 0) +
      (if (node.has("leadingIcon")) 4 else 0) +
      (if (node.has("trailingIcon")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderInputField_2Group0(node, scope, mask, slot_placeholder, slot_leadingIcon, slot_trailingIcon)
      1 -> renderInputField_2Group1(node, scope, mask, slot_placeholder, slot_leadingIcon, slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputField_2Group0(node: ComposeNode, scope: Any?, mask: Int, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder)
      3 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder)
      4 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      5 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      6 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      7 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      8 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      9 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      10 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      11 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      12 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      13 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      14 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      15 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      16 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      17 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      18 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      19 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      20 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      21 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      22 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      23 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      24 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      25 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      26 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      27 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      28 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      29 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      30 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      31 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputField_2Group1(node: ComposeNode, scope: Any?, mask: Int, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      33 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      34 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      35 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      36 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      37 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      38 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      39 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      40 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      41 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      42 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      43 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      44 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      45 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      46 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      47 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      48 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      49 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      50 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      51 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      52 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      53 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      54 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      55 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      56 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      57 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      58 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      59 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      60 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      61 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      62 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      63 -> androidx.compose.material3.SearchBarDefaults.InputField(`query` = decode_query(node), `onQueryChange` = { value: String -> node.emit("onQueryChange", value) }, `onSearch` = { value: String -> node.emit("onSearch", value) }, `expanded` = decode_expanded(node), `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Label(label: kotlin.Function1<androidx.compose.material3.TooltipScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, isPersistent: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererLabel {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("interactionSource")) 1 else 0) +
      (if (node.has("isPersistent")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Label(
        `label` = { RenderComposeChildren(node.slot("label"), this) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.Label(
        `label` = { RenderComposeChildren(node.slot("label"), this) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.Label(
        `label` = { RenderComposeChildren(node.slot("label"), this) },
        `modifier` = node.modifier("modifier", scope),
        `isPersistent` = node.boolean("isPersistent"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.Label(
        `label` = { RenderComposeChildren(node.slot("label"), this) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `isPersistent` = node.boolean("isPersistent"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LargeExtendedFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererLargeExtendedFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
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

// androidx.compose.material3.LargeExtendedFloatingActionButton(text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expanded: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererLargeExtendedFloatingActionButton_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("expanded")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
      )
      2 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      5 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
      )
      6 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      7 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      8 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      9 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
      )
      10 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      11 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      12 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      13 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      14 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      15 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      16 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.LargeExtendedFloatingActionButton(
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

// androidx.compose.material3.LargeFlexibleTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, subtitle: kotlin.Function0<kotlin.Unit>?, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, titleHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererLargeFlexibleTopAppBar {
  private fun decode_collapsedHeight(node: ComposeNode) = node.number("collapsedHeight").dp
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollBehaviorValue = if (node.has("scrollBehavior") && !node.isNull("scrollBehavior")) node.jsonObject("scrollBehavior").rememberComposeTopAppBarScrollBehavior() else null
    val slot_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val content_subtitle: @Composable () -> Unit = { RenderComposeChildren(node.slot("subtitle")) }
    val slot_subtitle = if (node.isNull("subtitle")) null else content_subtitle
    val slot_navigationIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("navigationIcon")) }
    val mask = (if (node.has("subtitle")) 1 else 0) +
      (if (node.has("navigationIcon")) 2 else 0) +
      (if (node.has("actions")) 4 else 0) +
      (if (node.has("titleHorizontalAlignment")) 8 else 0) +
      (if (node.has("collapsedHeight")) 16 else 0) +
      (if (node.has("expandedHeight")) 32 else 0) +
      (if (node.has("windowInsets")) 64 else 0) +
      (if (node.has("scrollBehavior")) 128 else 0)
    when (mask / 32) {
      0 -> renderLargeFlexibleTopAppBarGroup0(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      1 -> renderLargeFlexibleTopAppBarGroup1(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      2 -> renderLargeFlexibleTopAppBarGroup2(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      3 -> renderLargeFlexibleTopAppBarGroup3(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      4 -> renderLargeFlexibleTopAppBarGroup4(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      7 -> renderLargeFlexibleTopAppBarGroup7(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle)
      2 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon)
      3 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon)
      4 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      5 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      6 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      7 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      8 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      9 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      10 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      11 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      12 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      13 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      14 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      15 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      16 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node))
      17 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node))
      18 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node))
      19 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node))
      20 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      21 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      22 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      23 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      24 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      25 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      26 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      27 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      28 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      29 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      30 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      31 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node))
      33 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `expandedHeight` = decode_expandedHeight(node))
      34 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      35 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      36 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      37 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      38 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      39 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      40 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      41 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      42 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      43 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      44 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      45 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      46 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      47 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      48 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      49 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      50 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      51 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      52 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      53 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      54 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      55 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      56 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      57 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      58 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      59 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      60 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      61 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      62 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      63 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup2(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      65 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      66 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      67 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      68 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      69 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      70 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      71 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      72 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      73 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      74 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      75 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      76 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      77 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      78 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      79 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      80 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      81 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      82 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      83 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      84 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      85 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      86 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      87 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      88 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      89 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      90 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      91 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      92 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      93 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      94 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      95 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup3(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      97 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      98 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      99 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      100 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      101 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      102 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      103 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      104 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      105 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      106 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      107 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      108 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      109 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      110 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      111 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      112 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      113 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      114 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      115 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      116 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      117 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      118 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      119 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      120 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      121 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      122 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      123 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      124 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      125 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      126 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      127 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup4(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      129 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      130 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      131 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      132 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      133 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      134 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      135 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      136 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      137 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      138 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      139 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      140 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      141 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      142 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      143 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      144 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      145 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      146 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      147 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      148 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      149 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      150 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      151 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      152 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      153 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      154 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      155 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      156 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      157 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      158 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      159 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup7(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      255 -> androidx.compose.material3.LargeFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LargeFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererLargeFloatingActionButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.LargeFloatingActionButton(
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

// androidx.compose.material3.LargeTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererLargeTopAppBar {
  private fun decode_collapsedHeight(node: ComposeNode) = node.number("collapsedHeight").dp
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollBehaviorValue = if (node.has("scrollBehavior") && !node.isNull("scrollBehavior")) node.jsonObject("scrollBehavior").rememberComposeTopAppBarScrollBehavior() else null
    val slot_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val slot_navigationIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("navigationIcon")) }
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("collapsedHeight")) 4 else 0) +
      (if (node.has("expandedHeight")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0) +
      (if (node.has("scrollBehavior")) 32 else 0)
    when (mask / 32) {
      0 -> renderLargeTopAppBarGroup0(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      1 -> renderLargeTopAppBarGroup1(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderLargeTopAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon)
      2 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      3 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      4 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node))
      5 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node))
      6 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      7 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      8 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node))
      9 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      10 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      11 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      12 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      13 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      14 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      15 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      16 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      17 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      18 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      19 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      20 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      21 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      22 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      23 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      24 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      25 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      26 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      27 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      28 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      29 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      30 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      31 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderLargeTopAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      33 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      34 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      35 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      36 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      37 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      38 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      39 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      40 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      41 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      42 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      43 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      44 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      45 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      46 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      47 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      48 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      49 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      50 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      51 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      52 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      53 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      54 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      55 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      56 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      57 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      58 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      59 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      60 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      61 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      62 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      63 -> androidx.compose.material3.LargeTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.ui.layout.Layout(modifier: androidx.compose.ui.Modifier, measurePolicy: androidx.compose.ui.layout.MeasurePolicy)
internal object RendererLayout {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.ui.layout.Layout(
      `modifier` = node.modifier("modifier", scope),
      `measurePolicy` = node.jsonObject("measurePolicy").toComposeLayoutMeasurePolicy(),
    )
  }
}

// androidx.compose.ui.layout.Layout(content: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, measurePolicy: androidx.compose.ui.layout.MeasurePolicy)
internal object RendererLayout_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.ui.layout.Layout(
      `modifier` = node.modifier("modifier", scope),
      `measurePolicy` = node.jsonObject("measurePolicy").toComposeLayoutMeasurePolicy(),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.foundation.lazy.LazyColumn(modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.LazyListState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalAlignment: androidx.compose.ui.Alignment.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>)
internal object RendererLazyColumn {
  private fun decode_reverseLayout(node: ComposeNode) = node.boolean("reverseLayout")
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyListState(node.arguments()) else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalArrangement")) 8 else 0) +
      (if (node.has("horizontalAlignment")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyColumnGroup0(node, scope, mask, stateValue)
      1 -> renderLazyColumnGroup1(node, scope, mask, stateValue)
      2 -> renderLazyColumnGroup2(node, scope, mask, stateValue)
      3 -> renderLazyColumnGroup3(node, scope, mask, stateValue)
      4 -> renderLazyColumnGroup4(node, scope, mask, stateValue)
      5 -> renderLazyColumnGroup5(node, scope, mask, stateValue)
      6 -> renderLazyColumnGroup6(node, scope, mask, stateValue)
      7 -> renderLazyColumnGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), content = { renderLazyComposeChildren(node.children) })
      1 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = { renderLazyComposeChildren(node.children) })
      2 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      3 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      4 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      5 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      6 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      7 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      8 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      9 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      10 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      11 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      12 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      13 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      14 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      15 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      16 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      17 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      18 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      19 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      20 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      21 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      22 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      23 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      24 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      25 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      26 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      27 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      28 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      29 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      30 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      31 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      33 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      34 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      35 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      36 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      37 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      38 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      39 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      65 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      66 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      67 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      68 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      69 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      70 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      71 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      72 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      73 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      74 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      75 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      76 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      77 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      78 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      79 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      80 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      81 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      82 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      83 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      84 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      85 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      86 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      87 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      88 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      89 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      90 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      91 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      92 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      93 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      94 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      95 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      97 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      98 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      99 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      100 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      101 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      102 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      103 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      127 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      129 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      130 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      131 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      132 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      133 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      134 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      135 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      193 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      194 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      195 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      196 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      197 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      198 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      199 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      223 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.LazyColumn(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(rows: androidx.compose.foundation.lazy.grid.GridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.grid.LazyGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit>)
internal object RendererLazyHorizontalGrid {
  private fun decode_reverseLayout(node: ComposeNode) = node.boolean("reverseLayout")
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyGridState(node.arguments()) else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("horizontalArrangement")) 8 else 0) +
      (if (node.has("verticalArrangement")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyHorizontalGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyHorizontalGridGroup1(node, scope, mask, stateValue)
      2 -> renderLazyHorizontalGridGroup2(node, scope, mask, stateValue)
      3 -> renderLazyHorizontalGridGroup3(node, scope, mask, stateValue)
      4 -> renderLazyHorizontalGridGroup4(node, scope, mask, stateValue)
      5 -> renderLazyHorizontalGridGroup5(node, scope, mask, stateValue)
      6 -> renderLazyHorizontalGridGroup6(node, scope, mask, stateValue)
      7 -> renderLazyHorizontalGridGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), content = { renderLazyComposeChildren(node.children) })
      1 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = { renderLazyComposeChildren(node.children) })
      2 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      3 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      4 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      5 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      6 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      7 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      8 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      9 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      10 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      11 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      12 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      13 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      14 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      15 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      16 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      17 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      18 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      19 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      20 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      21 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      22 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      23 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      24 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      25 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      26 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      27 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      28 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      29 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      30 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      31 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      33 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      34 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      35 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      36 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      37 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      38 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      39 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      65 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      66 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      67 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      68 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      69 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      70 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      71 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      72 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      73 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      74 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      75 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      76 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      77 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      78 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      79 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      80 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      81 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      82 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      83 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      84 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      85 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      86 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      87 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      88 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      89 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      90 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      91 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      92 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      93 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      94 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      95 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      97 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      98 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      99 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      100 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      101 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      102 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      103 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      127 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      129 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      130 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      131 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      132 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      133 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      134 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      135 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      193 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      194 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      195 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      196 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      197 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      198 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      199 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      223 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(`rows` = node.jsonObject("rows").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(rows: androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalItemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit>)
internal object RendererLazyHorizontalStaggeredGrid {
  private fun decode_reverseLayout(node: ComposeNode) = node.boolean("reverseLayout")
  private fun decode_horizontalItemSpacing(node: ComposeNode) = node.number("horizontalItemSpacing").dp
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyStaggeredGridState(node.arguments()) else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalArrangement")) 8 else 0) +
      (if (node.has("horizontalItemSpacing")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyHorizontalStaggeredGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyHorizontalStaggeredGridGroup1(node, scope, mask, stateValue)
      2 -> renderLazyHorizontalStaggeredGridGroup2(node, scope, mask, stateValue)
      3 -> renderLazyHorizontalStaggeredGridGroup3(node, scope, mask, stateValue)
      4 -> renderLazyHorizontalStaggeredGridGroup4(node, scope, mask, stateValue)
      5 -> renderLazyHorizontalStaggeredGridGroup5(node, scope, mask, stateValue)
      6 -> renderLazyHorizontalStaggeredGridGroup6(node, scope, mask, stateValue)
      7 -> renderLazyHorizontalStaggeredGridGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), content = { renderLazyComposeChildren(node.children) })
      1 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = { renderLazyComposeChildren(node.children) })
      2 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      3 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      4 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      5 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      6 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      7 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      8 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      9 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      10 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      11 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      12 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      13 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      14 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      15 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      16 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      17 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      18 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      19 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      20 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      21 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      22 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      23 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      24 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      25 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      26 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      27 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      28 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      29 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      30 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      31 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      33 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      36 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      37 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      48 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      49 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      52 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      53 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      65 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      66 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      67 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      68 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      69 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      70 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      71 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      72 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      73 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      74 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      75 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      76 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      77 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      78 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      79 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      80 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      81 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      82 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      83 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      84 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      85 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      86 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      87 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      88 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      89 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      90 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      91 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      92 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      93 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      94 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      95 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      97 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      100 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      101 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      112 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      113 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      116 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      117 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      127 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      129 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      132 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      133 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      144 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      145 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      148 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      149 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      193 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      196 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      197 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      208 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      209 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      212 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      213 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      223 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(`rows` = node.jsonObject("rows").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalItemSpacing` = decode_horizontalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.LazyRow(modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.LazyListState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalAlignment: androidx.compose.ui.Alignment.Vertical, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>)
internal object RendererLazyRow {
  private fun decode_reverseLayout(node: ComposeNode) = node.boolean("reverseLayout")
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyListState(node.arguments()) else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("horizontalArrangement")) 8 else 0) +
      (if (node.has("verticalAlignment")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyRowGroup0(node, scope, mask, stateValue)
      1 -> renderLazyRowGroup1(node, scope, mask, stateValue)
      2 -> renderLazyRowGroup2(node, scope, mask, stateValue)
      3 -> renderLazyRowGroup3(node, scope, mask, stateValue)
      4 -> renderLazyRowGroup4(node, scope, mask, stateValue)
      5 -> renderLazyRowGroup5(node, scope, mask, stateValue)
      6 -> renderLazyRowGroup6(node, scope, mask, stateValue)
      7 -> renderLazyRowGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), content = { renderLazyComposeChildren(node.children) })
      1 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = { renderLazyComposeChildren(node.children) })
      2 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      3 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      4 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      5 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      6 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      7 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      8 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      9 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      10 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      11 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      12 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      13 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      14 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      15 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      16 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      17 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      18 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      19 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      20 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      21 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      22 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      23 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      24 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      25 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      26 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      27 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      28 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      29 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      30 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      31 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      33 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      34 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      35 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      36 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      37 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      38 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      39 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      65 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      66 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      67 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      68 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      69 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      70 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      71 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      72 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      73 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      74 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      75 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      76 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      77 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      78 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      79 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      80 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      81 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      82 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      83 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      84 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      85 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      86 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      87 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      88 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      89 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      90 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      91 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      92 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      93 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      94 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      95 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      97 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      98 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      99 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      100 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      101 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      102 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      103 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      127 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      129 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      130 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      131 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      132 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      133 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      134 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      135 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      193 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      194 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      195 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      196 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      197 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      198 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      199 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      223 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.LazyRow(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.grid.LazyVerticalGrid(columns: androidx.compose.foundation.lazy.grid.GridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.grid.LazyGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit>)
internal object RendererLazyVerticalGrid {
  private fun decode_reverseLayout(node: ComposeNode) = node.boolean("reverseLayout")
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyGridState(node.arguments()) else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalArrangement")) 8 else 0) +
      (if (node.has("horizontalArrangement")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyVerticalGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyVerticalGridGroup1(node, scope, mask, stateValue)
      2 -> renderLazyVerticalGridGroup2(node, scope, mask, stateValue)
      3 -> renderLazyVerticalGridGroup3(node, scope, mask, stateValue)
      4 -> renderLazyVerticalGridGroup4(node, scope, mask, stateValue)
      5 -> renderLazyVerticalGridGroup5(node, scope, mask, stateValue)
      6 -> renderLazyVerticalGridGroup6(node, scope, mask, stateValue)
      7 -> renderLazyVerticalGridGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), content = { renderLazyComposeChildren(node.children) })
      1 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = { renderLazyComposeChildren(node.children) })
      2 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      3 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      4 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      5 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      6 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      7 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      8 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      9 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      10 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      11 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      12 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      13 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      14 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      15 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), content = { renderLazyComposeChildren(node.children) })
      16 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      17 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      18 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      19 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      20 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      21 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      22 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      23 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      24 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      25 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      26 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      27 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      28 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      29 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      30 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      31 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      33 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      34 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      35 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      36 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      37 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      38 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      39 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      65 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      66 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      67 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      68 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      69 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      70 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      71 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      72 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      73 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      74 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      75 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      76 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      77 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      78 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      79 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      80 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      81 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      82 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      83 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      84 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      85 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      86 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      87 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      88 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      89 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      90 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      91 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      92 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      93 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      94 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      95 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      97 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      98 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      99 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      100 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      101 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      102 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      103 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      127 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      129 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      130 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      131 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      132 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      133 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      134 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      135 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      193 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      194 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      195 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      196 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      197 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      198 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      199 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      223 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(`columns` = node.jsonObject("columns").toGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(columns: androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalItemSpacing: androidx.compose.ui.unit.Dp, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit>)
internal object RendererLazyVerticalStaggeredGrid {
  private fun decode_reverseLayout(node: ComposeNode) = node.boolean("reverseLayout")
  private fun decode_verticalItemSpacing(node: ComposeNode) = node.number("verticalItemSpacing").dp
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyStaggeredGridState(node.arguments()) else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalItemSpacing")) 8 else 0) +
      (if (node.has("horizontalArrangement")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyVerticalStaggeredGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyVerticalStaggeredGridGroup1(node, scope, mask, stateValue)
      2 -> renderLazyVerticalStaggeredGridGroup2(node, scope, mask, stateValue)
      3 -> renderLazyVerticalStaggeredGridGroup3(node, scope, mask, stateValue)
      4 -> renderLazyVerticalStaggeredGridGroup4(node, scope, mask, stateValue)
      5 -> renderLazyVerticalStaggeredGridGroup5(node, scope, mask, stateValue)
      6 -> renderLazyVerticalStaggeredGridGroup6(node, scope, mask, stateValue)
      7 -> renderLazyVerticalStaggeredGridGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), content = { renderLazyComposeChildren(node.children) })
      1 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = { renderLazyComposeChildren(node.children) })
      2 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      3 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      4 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      5 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      6 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      7 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      8 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      9 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      10 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      11 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      12 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      13 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      14 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      15 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      16 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      17 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      18 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      19 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      20 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      21 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      22 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      23 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      24 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      25 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      26 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      27 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      28 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      29 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      30 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      31 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      33 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      36 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      37 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      40 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      41 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      44 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      45 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      65 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      66 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      67 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      68 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      69 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      70 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      71 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      72 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      73 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      74 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      75 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      76 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      77 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      78 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      79 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      80 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      81 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      82 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      83 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      84 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      85 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      86 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      87 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      88 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      89 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      90 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      91 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      92 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      93 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      94 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      95 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      97 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      100 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      101 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      104 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      105 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      108 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      109 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      127 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      129 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      132 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      133 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      136 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      137 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      140 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      141 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      193 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      196 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      197 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      200 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      201 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      204 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      205 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      223 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SplitButtonDefaults.LeadingButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererLeadingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
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

// androidx.compose.material3.LeadingIconTab(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, selectedContentColor: androidx.compose.ui.graphics.Color, unselectedContentColor: androidx.compose.ui.graphics.Color, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererLeadingIconTab {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("selectedContentColor")) 2 else 0) +
      (if (node.has("unselectedContentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      3 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      4 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      5 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      6 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      7 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      8 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      9 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      10 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      11 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      12 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      13 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      14 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      15 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, strokeCap: androidx.compose.ui.graphics.StrokeCap, gapSize: androidx.compose.ui.unit.Dp)
internal object RendererLinearProgressIndicator {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("gapSize")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, strokeCap: androidx.compose.ui.graphics.StrokeCap, gapSize: androidx.compose.ui.unit.Dp, drawStopIndicator: kotlin.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>)
internal object RendererLinearProgressIndicator_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("gapSize")) 4 else 0) +
      (if (node.has("drawStopIndicator")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      8 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      9 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      10 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      11 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      12 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      13 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      14 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      15 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearWavyProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Float, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererLinearWavyProgressIndicator {
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
      0 -> renderLinearWavyProgressIndicatorGroup0(node, scope, mask)
      1 -> renderLinearWavyProgressIndicatorGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicatorGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node))
      3 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node))
      4 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node))
      5 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node))
      6 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      7 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      8 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node))
      9 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node))
      10 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      11 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      12 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      13 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      14 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      15 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      16 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node))
      17 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node))
      18 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      19 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      20 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      21 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      22 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      23 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      24 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      25 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      26 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      27 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      28 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      29 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      30 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      31 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicatorGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `waveSpeed` = decode_waveSpeed(node))
      33 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `waveSpeed` = decode_waveSpeed(node))
      34 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      35 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      36 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      37 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      38 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      39 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      40 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      41 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      42 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      43 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      44 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      45 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      46 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      47 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      48 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      49 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      50 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      51 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      52 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      53 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      54 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      55 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      56 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      57 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      58 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      59 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      60 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      61 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      62 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      63 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearWavyProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, stopSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Function1<kotlin.Float, kotlin.Float>, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererLinearWavyProgressIndicator_1 {
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_trackColor(node: ComposeNode) = node.color("trackColor")
  private fun decode_gapSize(node: ComposeNode) = node.number("gapSize").dp
  private fun decode_stopSize(node: ComposeNode) = node.number("stopSize").dp
  private fun decode_wavelength(node: ComposeNode) = node.number("wavelength").dp
  private fun decode_waveSpeed(node: ComposeNode) = node.number("waveSpeed").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("gapSize")) 4 else 0) +
      (if (node.has("stopSize")) 8 else 0) +
      (if (node.has("wavelength")) 16 else 0) +
      (if (node.has("waveSpeed")) 32 else 0)
    when (mask / 32) {
      0 -> renderLinearWavyProgressIndicator_1Group0(node, scope, mask)
      1 -> renderLinearWavyProgressIndicator_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicator_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node))
      3 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node))
      4 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node))
      5 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node))
      6 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      7 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      8 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stopSize` = decode_stopSize(node))
      9 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stopSize` = decode_stopSize(node))
      10 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node))
      11 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node))
      12 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node))
      13 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node))
      14 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node))
      15 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node))
      16 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node))
      17 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node))
      18 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      19 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      20 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      21 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      22 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      23 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      24 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      25 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      26 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      27 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      28 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      29 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      30 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      31 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicator_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `waveSpeed` = decode_waveSpeed(node))
      33 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `waveSpeed` = decode_waveSpeed(node))
      34 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      35 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      36 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      37 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      38 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      39 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      40 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      41 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      42 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      43 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      44 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      45 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      46 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      47 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      48 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      49 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      50 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      51 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      52 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      53 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      54 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      55 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      56 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      57 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      58 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      59 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      60 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      61 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      62 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      63 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
