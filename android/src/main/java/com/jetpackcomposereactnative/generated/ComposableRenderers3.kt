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
    val mask = (if (node.has("matchAnchorWidth")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("tonalElevation")) 8 else 0) +
      (if (node.has("shadowElevation")) 16 else 0) +
      (if (node.has("border")) 32 else 0)
    when (mask / 32) {
      0 -> renderExposedDropdownMenuGroup0(node, scope, mask)
      1 -> renderExposedDropdownMenuGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderExposedDropdownMenuGroup0(node: ComposeNode, scope: androidx.compose.material3.ExposedDropdownMenuBoxScope, mask: Int) {
    when (mask) {
      0 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), content = { RenderComposeChildren(node.children, this) })
      2 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      5 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      6 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      7 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      8 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      9 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      10 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      11 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      12 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      13 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      14 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      15 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      16 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      17 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      18 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      19 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      20 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      21 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      22 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      23 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      24 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      25 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      26 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      27 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      28 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      29 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      30 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      31 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderExposedDropdownMenuGroup1(node: ComposeNode, scope: androidx.compose.material3.ExposedDropdownMenuBoxScope, mask: Int) {
    when (mask) {
      32 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      33 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      34 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      35 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      36 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      37 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      38 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      39 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      40 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      41 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      42 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      43 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      44 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      45 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      46 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      47 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      48 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      49 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      50 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      51 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      52 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      53 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      54 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      55 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      56 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      57 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      58 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      59 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      60 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      61 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      62 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      63 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
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

// androidx.compose.material3.FilledIconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledTonalButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererFilledTonalButton {
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
      0 -> renderFilledTonalButtonGroup0(node, scope, mask)
      1 -> renderFilledTonalButtonGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalButtonGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledTonalIconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledTonalIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledTonalIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledTonalIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilterChip(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SelectableChipColors, elevation: androidx.compose.material3.SelectableChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererFilterChip {
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
      0 -> renderFilterChipGroup0(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      1 -> renderFilterChipGroup1(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      2 -> renderFilterChipGroup2(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      3 -> renderFilterChipGroup3(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      3 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      4 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      5 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      6 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      7 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      8 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      9 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      10 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      11 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      12 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      13 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      14 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      15 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      16 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      17 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      18 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      19 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      20 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      21 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      22 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      23 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      24 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      25 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      26 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      27 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      28 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      29 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      30 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      31 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      33 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      34 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      35 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      36 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      37 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      38 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      39 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      40 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      41 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      42 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      43 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      44 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      45 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      46 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      47 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      48 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      49 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      50 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      51 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      52 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      53 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      54 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      55 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      56 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      57 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      58 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      59 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      60 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      61 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      62 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      63 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      65 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      66 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      67 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      68 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      69 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      70 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      71 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      72 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      73 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      74 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      75 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      76 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      77 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      78 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      79 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      80 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      81 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      82 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      83 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      84 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      85 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      86 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      87 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      88 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      89 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      90 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      91 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      92 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      93 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      94 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      95 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      97 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      98 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      99 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      100 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      101 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      102 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      103 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      104 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      105 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      106 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      107 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      108 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      109 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      110 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      111 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      112 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      113 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      114 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      115 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      116 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      117 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      118 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      119 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      120 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      121 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      122 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      123 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      124 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      125 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      126 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      127 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.FlexBox(modifier: androidx.compose.ui.Modifier, config: androidx.compose.foundation.layout.FlexBoxConfig, content: kotlin.Function1<androidx.compose.foundation.layout.FlexBoxScope, kotlin.Unit>)
internal object RendererFlexBox {
  @OptIn(androidx.compose.foundation.layout.ExperimentalFlexBoxApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("config")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.FlexBox(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.FlexBox(
        `modifier` = node.modifier("modifier", scope),
        `config` = node.jsonObject("config").toComposeFlexBoxConfig(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FlexibleBottomAppBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, contentPadding: androidx.compose.foundation.layout.PaddingValues, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, scrollBehavior: androidx.compose.material3.BottomAppBarScrollBehavior?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererFlexibleBottomAppBar {
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("horizontalArrangement")) 8 else 0) +
      (if (node.has("expandedHeight")) 16 else 0) +
      (if (node.has("windowInsets")) 32 else 0)
    when (mask / 32) {
      0 -> renderFlexibleBottomAppBarGroup0(node, scope, mask)
      1 -> renderFlexibleBottomAppBarGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderFlexibleBottomAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderFlexibleBottomAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFloatingActionButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FloatingActionButton(
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

// androidx.compose.material3.FloatingActionButtonMenu(expanded: kotlin.Boolean, button: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, horizontalAlignment: androidx.compose.ui.Alignment.Horizontal, content: kotlin.Function1<androidx.compose.material3.FloatingActionButtonMenuScope, kotlin.Unit>)
internal object RendererFloatingActionButtonMenu {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("horizontalAlignment")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FloatingActionButtonMenu(
        `expanded` = node.boolean("expanded"),
        `button` = { RenderComposeChildren(node.slot("button")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.FloatingActionButtonMenu(
        `expanded` = node.boolean("expanded"),
        `button` = { RenderComposeChildren(node.slot("button")) },
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FloatingActionButtonMenuItem [receiver: androidx.compose.material3.FloatingActionButtonMenuScope](onClick: kotlin.Function0<kotlin.Unit>, text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color)
internal object RendererFloatingActionButtonMenuItem {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.FloatingActionButtonMenuScope) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0)
    when (mask) {
      0 -> scope.composeScoped0(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> scope.composeScoped0(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      2 -> scope.composeScoped0(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      3 -> scope.composeScoped0(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.FlowColumn(modifier: androidx.compose.ui.Modifier, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, itemHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, maxItemsInEachColumn: kotlin.Int, maxLines: kotlin.Int, content: kotlin.Function1<androidx.compose.foundation.layout.FlowColumnScope, kotlin.Unit>)
internal object RendererFlowColumn {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("verticalArrangement")) 1 else 0) +
      (if (node.has("horizontalArrangement")) 2 else 0) +
      (if (node.has("itemHorizontalAlignment")) 4 else 0) +
      (if (node.has("maxItemsInEachColumn")) 8 else 0) +
      (if (node.has("maxLines")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.FlowRow(modifier: androidx.compose.ui.Modifier, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, itemVerticalAlignment: androidx.compose.ui.Alignment.Vertical, maxItemsInEachRow: kotlin.Int, maxLines: kotlin.Int, content: kotlin.Function1<androidx.compose.foundation.layout.FlowRowScope, kotlin.Unit>)
internal object RendererFlowRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("horizontalArrangement")) 1 else 0) +
      (if (node.has("verticalArrangement")) 2 else 0) +
      (if (node.has("itemVerticalAlignment")) 4 else 0) +
      (if (node.has("maxItemsInEachRow")) 8 else 0) +
      (if (node.has("maxLines")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.Grid(config: kotlin.Function1<androidx.compose.foundation.layout.GridConfigurationScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, content: kotlin.Function1<androidx.compose.foundation.layout.GridScope, kotlin.Unit>)
internal object RendererGrid {
  @OptIn(androidx.compose.foundation.layout.ExperimentalGridApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.layout.Grid(
      `config` = node.jsonObject("config").toComposeGridConfig(),
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

// androidx.compose.material3.HorizontalDivider(modifier: androidx.compose.ui.Modifier, thickness: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererHorizontalDivider {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("thickness")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.HorizontalDivider(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.HorizontalDivider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
      )
      2 -> androidx.compose.material3.HorizontalDivider(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.HorizontalDivider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.HorizontalFloatingToolbar(expanded: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.FloatingToolbarColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, scrollBehavior: androidx.compose.material3.FloatingToolbarScrollBehavior?, shape: androidx.compose.ui.graphics.Shape, leadingContent: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>?, trailingContent: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>?, expandedShadowElevation: androidx.compose.ui.unit.Dp, collapsedShadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererHorizontalFloatingToolbar {
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
      0 -> renderHorizontalFloatingToolbarGroup0(node, scope, mask)
      1 -> renderHorizontalFloatingToolbarGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderHorizontalFloatingToolbarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderHorizontalFloatingToolbarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.HorizontalFloatingToolbar(expanded: kotlin.Boolean, floatingActionButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.FloatingToolbarColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, scrollBehavior: androidx.compose.material3.FloatingToolbarScrollBehavior?, shape: androidx.compose.ui.graphics.Shape, floatingActionButtonPosition: androidx.compose.material3.FloatingToolbarHorizontalFabPosition, animationSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>, expandedShadowElevation: androidx.compose.ui.unit.Dp, collapsedShadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererHorizontalFloatingToolbar_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentPadding")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("animationSpec")) 4 else 0) +
      (if (node.has("expandedShadowElevation")) 8 else 0) +
      (if (node.has("collapsedShadowElevation")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.HorizontalFloatingToolbar(
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

// androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(state: androidx.compose.material3.carousel.CarouselState, preferredItemWidth: androidx.compose.ui.unit.Dp, modifier: androidx.compose.ui.Modifier, itemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, minSmallItemWidth: androidx.compose.ui.unit.Dp, maxSmallItemWidth: androidx.compose.ui.unit.Dp, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function2<androidx.compose.material3.carousel.CarouselItemScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalMultiBrowseCarousel {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeCarouselState(node) else null
    val mask = (if (node.has("itemSpacing")) 1 else 0) +
      (if (node.has("minSmallItemWidth")) 2 else 0) +
      (if (node.has("maxSmallItemWidth")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      1 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      2 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      3 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      4 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      5 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      6 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      7 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      8 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      9 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      10 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      11 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      12 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      13 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      14 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      15 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.pager.HorizontalPager(state: androidx.compose.foundation.pager.PagerState, modifier: androidx.compose.ui.Modifier, contentPadding: androidx.compose.foundation.layout.PaddingValues, pageSize: androidx.compose.foundation.pager.PageSize, beyondViewportPageCount: kotlin.Int, pageSpacing: androidx.compose.ui.unit.Dp, verticalAlignment: androidx.compose.ui.Alignment.Vertical, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, userScrollEnabled: kotlin.Boolean, reverseLayout: kotlin.Boolean, key: kotlin.Function1<kotlin.Int, kotlin.Any>?, pageNestedScrollConnection: androidx.compose.ui.input.nestedscroll.NestedScrollConnection, snapPosition: androidx.compose.foundation.gestures.snapping.SnapPosition, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, pageContent: kotlin.Function2<androidx.compose.foundation.pager.PagerScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalPager {
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
      (if (node.has("verticalAlignment")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0) +
      (if (node.has("reverseLayout")) 64 else 0) +
      (if (node.has("pageNestedScrollConnection")) 128 else 0) +
      (if (node.has("snapPosition")) 256 else 0) +
      (if (node.has("overscrollEffect")) 512 else 0)
    when (mask / 32) {
      0 -> renderHorizontalPagerGroup0(node, scope, mask, stateValue)
      1 -> renderHorizontalPagerGroup1(node, scope, mask, stateValue)
      2 -> renderHorizontalPagerGroup2(node, scope, mask, stateValue)
      3 -> renderHorizontalPagerGroup3(node, scope, mask, stateValue)
      4 -> renderHorizontalPagerGroup4(node, scope, mask, stateValue)
      5 -> renderHorizontalPagerGroup5(node, scope, mask, stateValue)
      6 -> renderHorizontalPagerGroup6(node, scope, mask, stateValue)
      7 -> renderHorizontalPagerGroup7(node, scope, mask, stateValue)
      8 -> renderHorizontalPagerGroup8(node, scope, mask, stateValue)
      9 -> renderHorizontalPagerGroup9(node, scope, mask, stateValue)
      10 -> renderHorizontalPagerGroup10(node, scope, mask, stateValue)
      11 -> renderHorizontalPagerGroup11(node, scope, mask, stateValue)
      15 -> renderHorizontalPagerGroup15(node, scope, mask, stateValue)
      16 -> renderHorizontalPagerGroup16(node, scope, mask, stateValue)
      17 -> renderHorizontalPagerGroup17(node, scope, mask, stateValue)
      18 -> renderHorizontalPagerGroup18(node, scope, mask, stateValue)
      19 -> renderHorizontalPagerGroup19(node, scope, mask, stateValue)
      23 -> renderHorizontalPagerGroup23(node, scope, mask, stateValue)
      24 -> renderHorizontalPagerGroup24(node, scope, mask, stateValue)
      31 -> renderHorizontalPagerGroup31(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      0 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      1 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      2 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      4 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      5 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      6 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      8 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      9 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      10 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      12 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      13 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      14 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      16 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      17 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      20 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      21 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      24 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      25 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      28 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      29 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      32 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      33 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      34 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      36 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      37 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      38 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      40 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      41 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      42 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      44 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      45 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      46 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      48 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      49 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      52 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      53 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      56 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      57 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      60 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      61 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      64 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      65 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      66 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      68 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      69 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      70 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      72 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      73 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      74 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      76 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      77 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      78 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      80 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      81 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      84 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      85 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      88 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      89 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      92 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      93 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      96 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      97 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      98 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      100 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      101 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      102 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      104 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      105 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      106 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      108 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      109 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      110 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      112 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      113 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      116 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      117 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      120 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      121 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      124 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      125 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      128 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      129 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      132 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      133 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      136 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      137 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      140 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      141 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      144 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      145 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      148 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      149 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      152 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      153 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      156 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      157 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      160 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      161 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      164 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      165 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      168 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      169 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      172 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      173 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      176 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      177 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      180 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      181 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      184 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      185 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      188 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      189 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      192 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      193 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      196 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      197 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      200 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      201 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      204 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      205 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      208 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      209 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      212 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      213 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      216 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      217 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      220 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      221 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      224 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      225 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      228 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      229 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      232 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      233 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      236 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      237 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      240 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      241 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      244 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      245 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      248 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      249 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      252 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      253 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      255 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      256 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      258 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      260 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      264 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      268 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup9(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      288 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      292 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      296 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      300 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup10(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      320 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      324 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      328 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      332 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup11(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      352 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      356 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      360 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      364 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup15(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      509 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      512 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      514 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      516 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      520 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      524 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup17(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      544 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      548 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      552 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      556 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup18(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      576 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      580 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      584 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      588 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup19(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      608 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      612 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      616 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      620 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup23(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      765 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup24(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      768 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup31(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      1023 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
