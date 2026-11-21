// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.PlainTooltip as composeScoped0
import androidx.compose.material3.RichTooltip as composeScoped1
import androidx.compose.material3.SegmentedButton as composeScoped2

// androidx.compose.material3.ModalBottomSheet(onDismissRequest: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, sheetState: androidx.compose.material3.SheetState, sheetMaxWidth: androidx.compose.ui.unit.Dp, sheetGesturesEnabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, scrimColor: androidx.compose.ui.graphics.Color, dragHandle: kotlin.Function0<kotlin.Unit>?, contentWindowInsets: kotlin.Function0<androidx.compose.foundation.layout.WindowInsets>, properties: androidx.compose.material3.ModalBottomSheetProperties, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererModalBottomSheet {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val sheetStateValue = if (node.has("sheetState") && !node.isNull("sheetState")) node.jsonObject("sheetState").rememberComposeSheetState() else null
    val mask = (if (node.has("sheetState")) 1 else 0) +
      (if (node.has("sheetMaxWidth")) 2 else 0) +
      (if (node.has("sheetGesturesEnabled")) 4 else 0) +
      (if (node.has("shape")) 8 else 0) +
      (if (node.has("containerColor")) 16 else 0) +
      (if (node.has("contentColor")) 32 else 0) +
      (if (node.has("tonalElevation")) 64 else 0) +
      (if (node.has("scrimColor")) 128 else 0) +
      (if (node.has("dragHandle")) 256 else 0) +
      (if (node.has("contentWindowInsets")) 512 else 0)
    when (mask / 32) {
      0 -> renderModalBottomSheetGroup0(node, scope, mask, sheetStateValue)
      1 -> renderModalBottomSheetGroup1(node, scope, mask, sheetStateValue)
      2 -> renderModalBottomSheetGroup2(node, scope, mask, sheetStateValue)
      3 -> renderModalBottomSheetGroup3(node, scope, mask, sheetStateValue)
      4 -> renderModalBottomSheetGroup4(node, scope, mask, sheetStateValue)
      5 -> renderModalBottomSheetGroup5(node, scope, mask, sheetStateValue)
      6 -> renderModalBottomSheetGroup6(node, scope, mask, sheetStateValue)
      7 -> renderModalBottomSheetGroup7(node, scope, mask, sheetStateValue)
      8 -> renderModalBottomSheetGroup8(node, scope, mask, sheetStateValue)
      9 -> renderModalBottomSheetGroup9(node, scope, mask, sheetStateValue)
      10 -> renderModalBottomSheetGroup10(node, scope, mask, sheetStateValue)
      11 -> renderModalBottomSheetGroup11(node, scope, mask, sheetStateValue)
      12 -> renderModalBottomSheetGroup12(node, scope, mask, sheetStateValue)
      13 -> renderModalBottomSheetGroup13(node, scope, mask, sheetStateValue)
      14 -> renderModalBottomSheetGroup14(node, scope, mask, sheetStateValue)
      15 -> renderModalBottomSheetGroup15(node, scope, mask, sheetStateValue)
      16 -> renderModalBottomSheetGroup16(node, scope, mask, sheetStateValue)
      17 -> renderModalBottomSheetGroup17(node, scope, mask, sheetStateValue)
      18 -> renderModalBottomSheetGroup18(node, scope, mask, sheetStateValue)
      19 -> renderModalBottomSheetGroup19(node, scope, mask, sheetStateValue)
      20 -> renderModalBottomSheetGroup20(node, scope, mask, sheetStateValue)
      21 -> renderModalBottomSheetGroup21(node, scope, mask, sheetStateValue)
      22 -> renderModalBottomSheetGroup22(node, scope, mask, sheetStateValue)
      23 -> renderModalBottomSheetGroup23(node, scope, mask, sheetStateValue)
      24 -> renderModalBottomSheetGroup24(node, scope, mask, sheetStateValue)
      25 -> renderModalBottomSheetGroup25(node, scope, mask, sheetStateValue)
      26 -> renderModalBottomSheetGroup26(node, scope, mask, sheetStateValue)
      27 -> renderModalBottomSheetGroup27(node, scope, mask, sheetStateValue)
      28 -> renderModalBottomSheetGroup28(node, scope, mask, sheetStateValue)
      29 -> renderModalBottomSheetGroup29(node, scope, mask, sheetStateValue)
      30 -> renderModalBottomSheetGroup30(node, scope, mask, sheetStateValue)
      31 -> renderModalBottomSheetGroup31(node, scope, mask, sheetStateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup0(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      0 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup1(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      32 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      33 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      34 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      35 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      36 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      37 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      38 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      39 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      40 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      41 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      42 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      43 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      44 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      45 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      46 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      47 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      48 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      49 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      50 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      51 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      52 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      53 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      54 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      55 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      56 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      57 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      58 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      59 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      60 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      61 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      62 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      63 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup2(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      64 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      65 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      66 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      67 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      68 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      69 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      70 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      71 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      72 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      73 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      74 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      75 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      76 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      77 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      78 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      79 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      80 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      81 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      82 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      83 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      84 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      85 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      86 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      87 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      88 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      89 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      90 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      91 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      92 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      93 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      94 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      95 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup3(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      96 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      97 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      98 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      99 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      100 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      101 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      102 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      103 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      104 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      105 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      106 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      107 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      108 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      109 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      110 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      111 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      112 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      113 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      114 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      115 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      116 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      117 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      118 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      119 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      120 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      121 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      122 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      123 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      124 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      125 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      126 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      127 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup4(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      128 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      129 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      130 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      131 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      132 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      133 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      134 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      135 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      136 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      137 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      138 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      139 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      140 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      141 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      142 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      143 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      144 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      145 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      146 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      147 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      148 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      149 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      150 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      151 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      152 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      153 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      154 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      155 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      156 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      157 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      158 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      159 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup5(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      160 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      161 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      162 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      163 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      164 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      165 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      166 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      167 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      168 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      169 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      170 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      171 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      172 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      173 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      174 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      175 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      176 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      177 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      178 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      179 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      180 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      181 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      182 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      183 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      184 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      185 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      186 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      187 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      188 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      189 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      190 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      191 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup6(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      192 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      193 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      194 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      195 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      196 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      197 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      198 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      199 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      200 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      201 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      202 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      203 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      204 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      205 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      206 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      207 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      208 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      209 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      210 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      211 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      212 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      213 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      214 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      215 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      216 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      217 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      218 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      219 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      220 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      221 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      222 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      223 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup7(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      224 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      225 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      226 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      227 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      228 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      229 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      230 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      231 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      232 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      233 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      234 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      235 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      236 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      237 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      238 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      239 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      240 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      241 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      242 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      243 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      244 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      245 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      246 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      247 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      248 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      249 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      250 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      251 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      252 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      253 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      254 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      255 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup8(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      256 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      257 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      258 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      259 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      260 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      261 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      262 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      263 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      264 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      265 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      266 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      267 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      268 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      269 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      270 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      271 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      272 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      273 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      274 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      275 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      276 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      277 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      278 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      279 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      280 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      281 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      282 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      283 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      284 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      285 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      286 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      287 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup9(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      288 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      289 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      290 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      291 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      292 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      293 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      294 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      295 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      296 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      297 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      298 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      299 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      300 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      301 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      302 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      303 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      304 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      305 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      306 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      307 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      308 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      309 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      310 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      311 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      312 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      313 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      314 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      315 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      316 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      317 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      318 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      319 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup10(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      320 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      321 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      322 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      323 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      324 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      325 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      326 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      327 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      328 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      329 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      330 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      331 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      332 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      333 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      334 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      335 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      336 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      337 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      338 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      339 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      340 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      341 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      342 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      343 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      344 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      345 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      346 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      347 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      348 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      349 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      350 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      351 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup11(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      352 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      353 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      354 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      355 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      356 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      357 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      358 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      359 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      360 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      361 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      362 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      363 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      364 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      365 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      366 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      367 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      368 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      369 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      370 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      371 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      372 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      373 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      374 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      375 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      376 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      377 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      378 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      379 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      380 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      381 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      382 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      383 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup12(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      384 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      385 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      386 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      387 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      388 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      389 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      390 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      391 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      392 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      393 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      394 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      395 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      396 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      397 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      398 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      399 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      400 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      401 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      402 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      403 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      404 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      405 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      406 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      407 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      408 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      409 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      410 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      411 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      412 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      413 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      414 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      415 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup13(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      416 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      417 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      418 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      419 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      420 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      421 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      422 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      423 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      424 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      425 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      426 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      427 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      428 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      429 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      430 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      431 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      432 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      433 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      434 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      435 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      436 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      437 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      438 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      439 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      440 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      441 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      442 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      443 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      444 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      445 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      446 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      447 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup14(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      448 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      449 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      450 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      451 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      452 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      453 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      454 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      455 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      456 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      457 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      458 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      459 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      460 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      461 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      462 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      463 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      464 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      465 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      466 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      467 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      468 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      469 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      470 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      471 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      472 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      473 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      474 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      475 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      476 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      477 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      478 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      479 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup15(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      480 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      481 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      482 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      483 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      484 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      485 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      486 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      487 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      488 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      489 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      490 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      491 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      492 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      493 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      494 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      495 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      496 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      497 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      498 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      499 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      500 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      501 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      502 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      503 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      504 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      505 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      506 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      507 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      508 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      509 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      510 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      511 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup16(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      512 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      513 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      514 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      515 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      516 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      517 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      518 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      519 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      520 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      521 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      522 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      523 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      524 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      525 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      526 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      527 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      528 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      529 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      530 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      531 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      532 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      533 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      534 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      535 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      536 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      537 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      538 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      539 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      540 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      541 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      542 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      543 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup17(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      544 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      545 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      546 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      547 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      548 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      549 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      550 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      551 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      552 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      553 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      554 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      555 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      556 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      557 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      558 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      559 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      560 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      561 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      562 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      563 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      564 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      565 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      566 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      567 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      568 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      569 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      570 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      571 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      572 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      573 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      574 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      575 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup18(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      576 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      577 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      578 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      579 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      580 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      581 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      582 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      583 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      584 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      585 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      586 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      587 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      588 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      589 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      590 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      591 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      592 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      593 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      594 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      595 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      596 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      597 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      598 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      599 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      600 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      601 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      602 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      603 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      604 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      605 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      606 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      607 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup19(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      608 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      609 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      610 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      611 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      612 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      613 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      614 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      615 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      616 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      617 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      618 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      619 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      620 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      621 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      622 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      623 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      624 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      625 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      626 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      627 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      628 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      629 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      630 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      631 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      632 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      633 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      634 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      635 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      636 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      637 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      638 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      639 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup20(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      640 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      641 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      642 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      643 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      644 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      645 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      646 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      647 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      648 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      649 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      650 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      651 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      652 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      653 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      654 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      655 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      656 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      657 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      658 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      659 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      660 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      661 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      662 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      663 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      664 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      665 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      666 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      667 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      668 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      669 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      670 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      671 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup21(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      672 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      673 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      674 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      675 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      676 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      677 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      678 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      679 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      680 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      681 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      682 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      683 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      684 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      685 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      686 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      687 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      688 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      689 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      690 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      691 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      692 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      693 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      694 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      695 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      696 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      697 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      698 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      699 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      700 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      701 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      702 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      703 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup22(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      704 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      705 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      706 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      707 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      708 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      709 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      710 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      711 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      712 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      713 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      714 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      715 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      716 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      717 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      718 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      719 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      720 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      721 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      722 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      723 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      724 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      725 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      726 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      727 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      728 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      729 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      730 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      731 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      732 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      733 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      734 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      735 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup23(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      736 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      737 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      738 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      739 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      740 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      741 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      742 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      743 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      744 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      745 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      746 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      747 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      748 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      749 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      750 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      751 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      752 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      753 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      754 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      755 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      756 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      757 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      758 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      759 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      760 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      761 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      762 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      763 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      764 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      765 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      766 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      767 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup24(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      768 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      769 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      770 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      771 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      772 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      773 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      774 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      775 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      776 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      777 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      778 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      779 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      780 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      781 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      782 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      783 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      784 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      785 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      786 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      787 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      788 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      789 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      790 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      791 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      792 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      793 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      794 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      795 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      796 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      797 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      798 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      799 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup25(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      800 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      801 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      802 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      803 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      804 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      805 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      806 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      807 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      808 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      809 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      810 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      811 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      812 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      813 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      814 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      815 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      816 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      817 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      818 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      819 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      820 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      821 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      822 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      823 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      824 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      825 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      826 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      827 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      828 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      829 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      830 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      831 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup26(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      832 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      833 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      834 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      835 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      836 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      837 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      838 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      839 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      840 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      841 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      842 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      843 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      844 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      845 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      846 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      847 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      848 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      849 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      850 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      851 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      852 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      853 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      854 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      855 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      856 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      857 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      858 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      859 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      860 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      861 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      862 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      863 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup27(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      864 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      865 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      866 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      867 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      868 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      869 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      870 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      871 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      872 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      873 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      874 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      875 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      876 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      877 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      878 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      879 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      880 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      881 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      882 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      883 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      884 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      885 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      886 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      887 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      888 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      889 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      890 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      891 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      892 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      893 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      894 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      895 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup28(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      896 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      897 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      898 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      899 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      900 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      901 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      902 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      903 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      904 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      905 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      906 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      907 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      908 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      909 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      910 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      911 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      912 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      913 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      914 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      915 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      916 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      917 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      918 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      919 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      920 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      921 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      922 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      923 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      924 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      925 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      926 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      927 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup29(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      928 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      929 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      930 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      931 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      932 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      933 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      934 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      935 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      936 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      937 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      938 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      939 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      940 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      941 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      942 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      943 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      944 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      945 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      946 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      947 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      948 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      949 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      950 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      951 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      952 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      953 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      954 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      955 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      956 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      957 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      958 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      959 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup30(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      960 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      961 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      962 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      963 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      964 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      965 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      966 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      967 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      968 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      969 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      970 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      971 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      972 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      973 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      974 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      975 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      976 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      977 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      978 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      979 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      980 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      981 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      982 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      983 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      984 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      985 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      986 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      987 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      988 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      989 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      990 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      991 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderModalBottomSheetGroup31(node: ComposeNode, scope: Any?, mask: Int, sheetStateValue: androidx.compose.material3.SheetState?) {
    when (mask) {
      992 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      993 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      994 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      995 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      996 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      997 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      998 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      999 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1000 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1001 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1002 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1003 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1004 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1005 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1006 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1007 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1008 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1009 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1010 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1011 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1012 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1013 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1014 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1015 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1016 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1017 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1018 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1019 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1020 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1021 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1022 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      1023 -> androidx.compose.material3.ModalBottomSheet(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `sheetState` = requireNotNull(sheetStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetGesturesEnabled` = node.boolean("sheetGesturesEnabled"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `scrimColor` = node.color("scrimColor"),
        `dragHandle` = if (node.isNull("dragHandle")) null else ({ RenderComposeChildren(node.slot("dragHandle")) }),
        `contentWindowInsets` = { node.jsonObject("contentWindowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ModalDrawerSheet(modifier: androidx.compose.ui.Modifier, drawerShape: androidx.compose.ui.graphics.Shape, drawerContainerColor: androidx.compose.ui.graphics.Color, drawerContentColor: androidx.compose.ui.graphics.Color, drawerTonalElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererModalDrawerSheet {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("drawerShape")) 1 else 0) +
      (if (node.has("drawerContainerColor")) 2 else 0) +
      (if (node.has("drawerContentColor")) 4 else 0) +
      (if (node.has("drawerTonalElevation")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.ModalDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.ModalDrawerSheet(
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

// androidx.compose.material3.ModalNavigationDrawer(drawerContent: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, drawerState: androidx.compose.material3.DrawerState, gesturesEnabled: kotlin.Boolean, scrimColor: androidx.compose.ui.graphics.Color, content: kotlin.Function0<kotlin.Unit>)
internal object RendererModalNavigationDrawer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("gesturesEnabled")) 1 else 0) +
      (if (node.has("scrimColor")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ModalWideNavigationRail(modifier: androidx.compose.ui.Modifier, state: androidx.compose.material3.WideNavigationRailState, hideOnCollapse: kotlin.Boolean, collapsedShape: androidx.compose.ui.graphics.Shape, expandedShape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.WideNavigationRailColors, header: kotlin.Function0<kotlin.Unit>?, expandedHeaderTopPadding: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.foundation.layout.Arrangement.Vertical, expandedProperties: androidx.compose.material3.ModalWideNavigationRailProperties, content: kotlin.Function0<kotlin.Unit>)
internal object RendererModalWideNavigationRail {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("hideOnCollapse")) 1 else 0) +
      (if (node.has("collapsedShape")) 2 else 0) +
      (if (node.has("expandedShape")) 4 else 0) +
      (if (node.has("header")) 8 else 0) +
      (if (node.has("expandedHeaderTopPadding")) 16 else 0) +
      (if (node.has("windowInsets")) 32 else 0) +
      (if (node.has("arrangement")) 64 else 0)
    when (mask / 32) {
      0 -> renderModalWideNavigationRailGroup0(node, scope, mask)
      1 -> renderModalWideNavigationRailGroup1(node, scope, mask)
      2 -> renderModalWideNavigationRailGroup2(node, scope, mask)
      3 -> renderModalWideNavigationRailGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      33 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      34 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      35 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      36 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      37 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      38 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      39 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      40 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      41 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      42 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      43 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      44 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      45 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      46 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      47 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      48 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      49 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      50 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      51 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      52 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      53 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      54 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      55 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      56 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      57 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      58 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      59 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      60 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      61 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      62 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      63 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      65 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      66 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      67 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      68 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      69 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      70 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      71 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      72 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      73 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      74 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      75 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      76 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      77 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      78 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      79 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      80 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      81 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      82 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      83 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      84 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      85 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      86 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      87 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      88 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      89 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      90 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      91 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      92 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      93 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      94 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      95 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      97 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      98 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      99 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      100 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      101 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      102 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      103 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      104 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      105 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      106 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      107 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      108 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      109 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      110 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      111 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      112 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      113 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      114 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      115 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      116 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      117 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      118 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      119 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      120 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      121 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      122 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      123 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      124 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      125 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      126 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      127 -> androidx.compose.material3.ModalWideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `hideOnCollapse` = node.boolean("hideOnCollapse"),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `expandedShape` = node.arguments().shape("expandedShape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `expandedHeaderTopPadding` = node.number("expandedHeaderTopPadding").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MultiChoiceSegmentedButtonRow(modifier: androidx.compose.ui.Modifier, space: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, kotlin.Unit>)
internal object RendererMultiChoiceSegmentedButtonRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("space")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MultiChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.MultiChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        `space` = node.number("space").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererNavigationBar {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationDrawerItem(label: kotlin.Function0<kotlin.Unit>, selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, icon: kotlin.Function0<kotlin.Unit>?, badge: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.NavigationDrawerItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererNavigationDrawerItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("icon")) 1 else 0) +
      (if (node.has("badge")) 2 else 0) +
      (if (node.has("shape")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      2 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
      )
      3 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
      )
      4 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      5 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      6 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
      )
      7 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationRail(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, header: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>?, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererNavigationRail {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("header")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationRailItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, label: kotlin.Function0<kotlin.Unit>?, alwaysShowLabel: kotlin.Boolean, colors: androidx.compose.material3.NavigationRailItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererNavigationRailItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("label")) 2 else 0) +
      (if (node.has("alwaysShowLabel")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      3 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      4 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      5 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      6 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      7 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.OutlinedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.OutlinedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.OutlinedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.OutlinedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.OutlinedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.OutlinedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.OutlinedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedCard(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererOutlinedCard {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedCard(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererOutlinedCard_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedIconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconButtonColors, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererOutlinedIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconToggleButtonColors, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererOutlinedIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedLeadingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedSecureTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, labelPosition: androidx.compose.material3.TextFieldLabelPosition, label: kotlin.Function1<androidx.compose.material3.TextFieldLabelScope, kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, textObfuscationMode: androidx.compose.foundation.text.input.TextObfuscationMode, textObfuscationCharacter: kotlin.Char, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererOutlinedSecureTextField {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("textStyle")) 2 else 0) +
      (if (node.has("placeholder")) 4 else 0) +
      (if (node.has("leadingIcon")) 8 else 0) +
      (if (node.has("trailingIcon")) 16 else 0) +
      (if (node.has("prefix")) 32 else 0) +
      (if (node.has("suffix")) 64 else 0) +
      (if (node.has("supportingText")) 128 else 0) +
      (if (node.has("isError")) 256 else 0) +
      (if (node.has("shape")) 512 else 0) +
      (if (node.has("contentPadding")) 1024 else 0)
    when (mask / 32) {
      0 -> renderOutlinedSecureTextFieldGroup0(node, scope, mask, stateValue)
      1 -> renderOutlinedSecureTextFieldGroup1(node, scope, mask, stateValue)
      2 -> renderOutlinedSecureTextFieldGroup2(node, scope, mask, stateValue)
      4 -> renderOutlinedSecureTextFieldGroup4(node, scope, mask, stateValue)
      8 -> renderOutlinedSecureTextFieldGroup8(node, scope, mask, stateValue)
      16 -> renderOutlinedSecureTextFieldGroup16(node, scope, mask, stateValue)
      32 -> renderOutlinedSecureTextFieldGroup32(node, scope, mask, stateValue)
      63 -> renderOutlinedSecureTextFieldGroup63(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      3 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      4 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      5 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      6 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      7 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      8 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      9 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      10 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      11 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      12 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      13 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      14 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      15 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      16 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      17 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      18 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      19 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      20 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      21 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      22 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      23 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      24 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      25 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      26 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      27 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      28 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      29 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      30 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      31 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      33 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      36 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      37 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      40 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      41 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      44 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      45 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      48 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      49 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      52 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      53 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      56 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      57 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      60 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      61 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      64 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      65 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      68 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      69 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      72 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      73 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      76 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      77 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      80 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      81 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      84 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      85 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      88 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      89 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      92 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      93 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      128 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      129 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      132 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      133 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      136 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      137 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      140 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      141 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      144 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      145 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      148 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      149 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      152 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      153 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      156 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      157 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      256 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `isError` = node.boolean("isError"),
      )
      257 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
      )
      260 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      261 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      264 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      265 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      268 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      269 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      272 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      273 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      276 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      277 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      280 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      281 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      284 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      285 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      512 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      513 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      516 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      517 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      520 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      521 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      524 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      525 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      528 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      529 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      532 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      533 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      536 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      537 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      540 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      541 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup32(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      1024 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1025 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1028 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1029 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1032 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1033 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1036 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1037 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1040 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1041 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1044 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1045 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1048 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1049 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1052 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1053 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup63(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      2047 -> androidx.compose.material3.OutlinedSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
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
}

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
      (if (node.has("shape")) 1024 else 0) +
      (if (node.has("contentPadding")) 2048 else 0)
    when (mask / 32) {
      0 -> renderOutlinedTextFieldGroup0(node, scope, mask, stateValue)
      1 -> renderOutlinedTextFieldGroup1(node, scope, mask, stateValue)
      2 -> renderOutlinedTextFieldGroup2(node, scope, mask, stateValue)
      4 -> renderOutlinedTextFieldGroup4(node, scope, mask, stateValue)
      8 -> renderOutlinedTextFieldGroup8(node, scope, mask, stateValue)
      16 -> renderOutlinedTextFieldGroup16(node, scope, mask, stateValue)
      32 -> renderOutlinedTextFieldGroup32(node, scope, mask, stateValue)
      64 -> renderOutlinedTextFieldGroup64(node, scope, mask, stateValue)
      127 -> renderOutlinedTextFieldGroup127(node, scope, mask, stateValue)
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
        `shape` = node.arguments().shape("shape"),
      )
      1025 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      1026 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      1027 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      1032 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1033 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1034 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1035 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1040 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1041 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1042 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1043 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1048 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1049 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1050 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1051 -> androidx.compose.material3.OutlinedTextField(
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
  private fun renderOutlinedTextFieldGroup64(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      2048 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2049 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2050 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2051 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2056 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2057 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2058 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2059 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2064 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2065 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2066 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2067 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2072 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2073 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2074 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2075 -> androidx.compose.material3.OutlinedTextField(
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
  private fun renderOutlinedTextFieldGroup127(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      4095 -> androidx.compose.material3.OutlinedTextField(
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
}
