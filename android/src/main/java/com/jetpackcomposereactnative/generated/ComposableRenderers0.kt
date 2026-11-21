// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.PlainTooltip as composeScoped0
import androidx.compose.material3.RichTooltip as composeScoped1
import androidx.compose.material3.SegmentedButton as composeScoped2

// androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon()
internal object RendererActiveIcon {
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon()
  }
}

// androidx.compose.material3.AlertDialog(onDismissRequest: kotlin.Function0<kotlin.Unit>, confirmButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, dismissButton: kotlin.Function0<kotlin.Unit>?, icon: kotlin.Function0<kotlin.Unit>?, title: kotlin.Function0<kotlin.Unit>?, text: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, iconContentColor: androidx.compose.ui.graphics.Color, titleContentColor: androidx.compose.ui.graphics.Color, textContentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, properties: androidx.compose.ui.window.DialogProperties)
internal object RendererAlertDialog {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("dismissButton")) 1 else 0) +
      (if (node.has("icon")) 2 else 0) +
      (if (node.has("title")) 4 else 0) +
      (if (node.has("text")) 8 else 0) +
      (if (node.has("shape")) 16 else 0) +
      (if (node.has("containerColor")) 32 else 0) +
      (if (node.has("iconContentColor")) 64 else 0) +
      (if (node.has("titleContentColor")) 128 else 0) +
      (if (node.has("textContentColor")) 256 else 0) +
      (if (node.has("tonalElevation")) 512 else 0)
    when (mask / 32) {
      0 -> renderAlertDialogGroup0(node, scope, mask)
      1 -> renderAlertDialogGroup1(node, scope, mask)
      2 -> renderAlertDialogGroup2(node, scope, mask)
      3 -> renderAlertDialogGroup3(node, scope, mask)
      4 -> renderAlertDialogGroup4(node, scope, mask)
      5 -> renderAlertDialogGroup5(node, scope, mask)
      6 -> renderAlertDialogGroup6(node, scope, mask)
      7 -> renderAlertDialogGroup7(node, scope, mask)
      8 -> renderAlertDialogGroup8(node, scope, mask)
      9 -> renderAlertDialogGroup9(node, scope, mask)
      10 -> renderAlertDialogGroup10(node, scope, mask)
      11 -> renderAlertDialogGroup11(node, scope, mask)
      12 -> renderAlertDialogGroup12(node, scope, mask)
      13 -> renderAlertDialogGroup13(node, scope, mask)
      14 -> renderAlertDialogGroup14(node, scope, mask)
      15 -> renderAlertDialogGroup15(node, scope, mask)
      16 -> renderAlertDialogGroup16(node, scope, mask)
      17 -> renderAlertDialogGroup17(node, scope, mask)
      18 -> renderAlertDialogGroup18(node, scope, mask)
      19 -> renderAlertDialogGroup19(node, scope, mask)
      20 -> renderAlertDialogGroup20(node, scope, mask)
      21 -> renderAlertDialogGroup21(node, scope, mask)
      22 -> renderAlertDialogGroup22(node, scope, mask)
      23 -> renderAlertDialogGroup23(node, scope, mask)
      24 -> renderAlertDialogGroup24(node, scope, mask)
      25 -> renderAlertDialogGroup25(node, scope, mask)
      26 -> renderAlertDialogGroup26(node, scope, mask)
      27 -> renderAlertDialogGroup27(node, scope, mask)
      28 -> renderAlertDialogGroup28(node, scope, mask)
      29 -> renderAlertDialogGroup29(node, scope, mask)
      30 -> renderAlertDialogGroup30(node, scope, mask)
      31 -> renderAlertDialogGroup31(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      )
      2 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      3 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      4 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      )
      5 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      )
      6 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      )
      7 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      )
      8 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      9 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      10 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      11 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      12 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      13 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      14 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      15 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      16 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      17 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
      )
      18 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      19 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      20 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
      )
      21 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
      )
      22 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
      )
      23 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
      )
      24 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
      )
      25 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
      )
      26 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
      )
      27 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
      )
      28 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
      )
      29 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
      )
      30 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
      )
      31 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      33 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
      )
      34 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
      )
      35 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
      )
      36 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
      )
      37 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
      )
      38 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
      )
      39 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
      )
      40 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
      )
      41 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
      )
      42 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
      )
      43 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
      )
      44 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
      )
      45 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
      )
      46 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
      )
      47 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
      )
      48 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      49 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      50 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      51 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      52 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      53 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      54 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      55 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      56 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      57 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      58 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      59 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      60 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      61 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      62 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      63 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `iconContentColor` = node.color("iconContentColor"),
      )
      65 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      66 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      67 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      68 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      69 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      70 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      71 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      72 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      73 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      74 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      75 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      76 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      77 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      78 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      79 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
      )
      80 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      81 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      82 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      83 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      84 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      85 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      86 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      87 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      88 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      89 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      90 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      91 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      92 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      93 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      94 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      95 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      97 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      98 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      99 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      100 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      101 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      102 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      103 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      104 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      105 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      106 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      107 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      108 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      109 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      110 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      111 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      112 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      113 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      114 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      115 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      116 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      117 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      118 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      119 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      120 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      121 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      122 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      123 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      124 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      125 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      126 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      127 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `titleContentColor` = node.color("titleContentColor"),
      )
      129 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      130 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      131 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      132 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      133 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      134 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      135 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      136 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      137 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      138 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      139 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      140 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      141 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      142 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      143 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
      )
      144 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      145 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      146 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      147 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      148 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      149 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      150 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      151 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      152 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      153 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      154 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      155 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      156 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      157 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      158 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      159 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      161 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      162 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      163 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      164 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      165 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      166 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      167 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      168 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      169 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      170 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      171 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      172 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      173 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      174 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      175 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      176 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      177 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      178 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      179 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      180 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      181 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      182 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      183 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      184 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      185 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      186 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      187 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      188 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      189 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      190 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      191 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      193 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      194 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      195 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      196 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      197 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      198 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      199 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      200 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      201 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      202 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      203 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      204 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      205 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      206 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      207 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      208 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      209 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      210 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      211 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      212 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      213 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      214 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      215 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      216 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      217 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      218 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      219 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      220 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      221 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      222 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      223 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      225 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      226 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      227 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      228 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      229 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      230 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      231 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      232 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      233 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      234 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      235 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      236 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      237 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      238 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      239 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      240 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      241 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      242 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      243 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      244 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      245 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      246 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      247 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      248 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      249 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      250 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      251 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      252 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      253 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      254 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      255 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `textContentColor` = node.color("textContentColor"),
      )
      257 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      258 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      259 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      260 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      261 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      262 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      263 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      264 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      265 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      266 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      267 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      268 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      269 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      270 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      271 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
      )
      272 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      273 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      274 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      275 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      276 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      277 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      278 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      279 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      280 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      281 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      282 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      283 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      284 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      285 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      286 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      287 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup9(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      288 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      289 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      290 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      291 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      292 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      293 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      294 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      295 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      296 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      297 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      298 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      299 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      300 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      301 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      302 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      303 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      304 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      305 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      306 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      307 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      308 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      309 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      310 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      311 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      312 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      313 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      314 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      315 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      316 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      317 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      318 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      319 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup10(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      320 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      321 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      322 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      323 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      324 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      325 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      326 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      327 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      328 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      329 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      330 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      331 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      332 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      333 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      334 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      335 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      336 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      337 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      338 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      339 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      340 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      341 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      342 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      343 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      344 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      345 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      346 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      347 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      348 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      349 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      350 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      351 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup11(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      352 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      353 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      354 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      355 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      356 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      357 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      358 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      359 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      360 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      361 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      362 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      363 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      364 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      365 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      366 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      367 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      368 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      369 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      370 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      371 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      372 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      373 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      374 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      375 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      376 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      377 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      378 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      379 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      380 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      381 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      382 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      383 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup12(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      384 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      385 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      386 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      387 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      388 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      389 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      390 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      391 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      392 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      393 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      394 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      395 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      396 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      397 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      398 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      399 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      400 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      401 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      402 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      403 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      404 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      405 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      406 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      407 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      408 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      409 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      410 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      411 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      412 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      413 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      414 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      415 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup13(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      416 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      417 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      418 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      419 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      420 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      421 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      422 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      423 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      424 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      425 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      426 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      427 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      428 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      429 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      430 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      431 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      432 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      433 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      434 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      435 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      436 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      437 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      438 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      439 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      440 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      441 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      442 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      443 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      444 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      445 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      446 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      447 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup14(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      448 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      449 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      450 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      451 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      452 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      453 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      454 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      455 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      456 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      457 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      458 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      459 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      460 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      461 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      462 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      463 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      464 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      465 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      466 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      467 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      468 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      469 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      470 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      471 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      472 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      473 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      474 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      475 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      476 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      477 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      478 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      479 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup15(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      480 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      481 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      482 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      483 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      484 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      485 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      486 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      487 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      488 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      489 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      490 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      491 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      492 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      493 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      494 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      495 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      496 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      497 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      498 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      499 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      500 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      501 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      502 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      503 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      504 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      505 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      506 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      507 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      508 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      509 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      510 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      511 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      513 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      514 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      515 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      516 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      517 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      518 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      519 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      520 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      521 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      522 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      523 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      524 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      525 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      526 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      527 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      528 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      529 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      530 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      531 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      532 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      533 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      534 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      535 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      536 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      537 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      538 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      539 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      540 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      541 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      542 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      543 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      545 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      546 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      547 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      548 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      549 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      550 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      551 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      552 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      553 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      554 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      555 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      556 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      557 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      558 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      559 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      560 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      561 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      562 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      563 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      564 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      565 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      566 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      567 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      568 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      569 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      570 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      571 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      572 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      573 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      574 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      575 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      577 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      578 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      579 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      580 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      581 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      582 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      583 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      584 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      585 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      586 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      587 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      588 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      589 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      590 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      591 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      592 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      593 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      594 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      595 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      596 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      597 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      598 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      599 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      600 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      601 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      602 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      603 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      604 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      605 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      606 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      607 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      609 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      610 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      611 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      612 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      613 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      614 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      615 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      616 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      617 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      618 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      619 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      620 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      621 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      622 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      623 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      624 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      625 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      626 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      627 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      628 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      629 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      630 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      631 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      632 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      633 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      634 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      635 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      636 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      637 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      638 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      639 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      641 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      642 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      643 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      644 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      645 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      646 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      647 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      648 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      649 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      650 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      651 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      652 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      653 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      654 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      655 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      656 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      657 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      658 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      659 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      660 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      661 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      662 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      663 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      664 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      665 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      666 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      667 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      668 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      669 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      670 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      671 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup21(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      672 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      673 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      674 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      675 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      676 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      677 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      678 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      679 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      680 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      681 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      682 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      683 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      684 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      685 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      686 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      687 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      688 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      689 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      690 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      691 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      692 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      693 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      694 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      695 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      696 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      697 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      698 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      699 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      700 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      701 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      702 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      703 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup22(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      704 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      705 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      706 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      707 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      708 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      709 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      710 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      711 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      712 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      713 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      714 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      715 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      716 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      717 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      718 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      719 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      720 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      721 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      722 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      723 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      724 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      725 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      726 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      727 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      728 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      729 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      730 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      731 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      732 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      733 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      734 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      735 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup23(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      736 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      737 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      738 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      739 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      740 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      741 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      742 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      743 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      744 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      745 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      746 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      747 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      748 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      749 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      750 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      751 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      752 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      753 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      754 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      755 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      756 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      757 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      758 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      759 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      760 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      761 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      762 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      763 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      764 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      765 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      766 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      767 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup24(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      768 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      769 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      770 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      771 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      772 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      773 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      774 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      775 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      776 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      777 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      778 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      779 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      780 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      781 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      782 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      783 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      784 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      785 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      786 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      787 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      788 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      789 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      790 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      791 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      792 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      793 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      794 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      795 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      796 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      797 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      798 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      799 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup25(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      800 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      801 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      802 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      803 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      804 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      805 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      806 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      807 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      808 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      809 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      810 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      811 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      812 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      813 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      814 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      815 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      816 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      817 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      818 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      819 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      820 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      821 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      822 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      823 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      824 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      825 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      826 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      827 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      828 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      829 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      830 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      831 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup26(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      832 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      833 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      834 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      835 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      836 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      837 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      838 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      839 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      840 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      841 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      842 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      843 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      844 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      845 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      846 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      847 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      848 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      849 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      850 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      851 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      852 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      853 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      854 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      855 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      856 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      857 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      858 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      859 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      860 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      861 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      862 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      863 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup27(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      864 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      865 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      866 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      867 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      868 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      869 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      870 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      871 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      872 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      873 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      874 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      875 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      876 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      877 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      878 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      879 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      880 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      881 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      882 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      883 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      884 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      885 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      886 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      887 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      888 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      889 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      890 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      891 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      892 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      893 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      894 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      895 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup28(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      896 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      897 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      898 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      899 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      900 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      901 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      902 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      903 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      904 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      905 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      906 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      907 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      908 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      909 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      910 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      911 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      912 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      913 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      914 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      915 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      916 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      917 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      918 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      919 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      920 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      921 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      922 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      923 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      924 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      925 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      926 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      927 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup29(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      928 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      929 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      930 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      931 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      932 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      933 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      934 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      935 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      936 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      937 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      938 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      939 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      940 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      941 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      942 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      943 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      944 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      945 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      946 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      947 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      948 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      949 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      950 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      951 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      952 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      953 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      954 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      955 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      956 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      957 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      958 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      959 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup30(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      960 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      961 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      962 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      963 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      964 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      965 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      966 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      967 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      968 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      969 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      970 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      971 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      972 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      973 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      974 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      975 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      976 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      977 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      978 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      979 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      980 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      981 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      982 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      983 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      984 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      985 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      986 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      987 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      988 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      989 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      990 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      991 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderAlertDialogGroup31(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      992 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      993 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      994 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      995 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      996 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      997 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      998 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      999 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1000 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1001 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1002 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1003 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1004 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1005 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1006 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1007 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1008 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1009 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1010 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1011 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1012 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1013 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1014 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1015 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1016 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1017 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1018 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1019 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1020 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1021 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1022 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      1023 -> androidx.compose.material3.AlertDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `iconContentColor` = node.color("iconContentColor"),
        `titleContentColor` = node.color("titleContentColor"),
        `textContentColor` = node.color("textContentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.animation.AnimatedVisibility(visible: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, enter: androidx.compose.animation.EnterTransition, exit: androidx.compose.animation.ExitTransition, label: kotlin.String, content: kotlin.Function1<androidx.compose.animation.AnimatedVisibilityScope, kotlin.Unit>)
internal object RendererAnimatedVisibility {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("label")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.animation.AnimatedVisibility(
        `visible` = node.boolean("visible"),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.animation.AnimatedVisibility(
        `visible` = node.boolean("visible"),
        `modifier` = node.modifier("modifier", scope),
        `label` = node.string("label"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.AssistChip(onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ChipColors, elevation: androidx.compose.material3.ChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererAssistChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("trailingIcon")) 4 else 0) +
      (if (node.has("shape")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      3 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      4 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      5 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      6 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      7 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      8 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      9 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      10 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      11 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      12 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      13 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      14 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      15 -> androidx.compose.material3.AssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Badge(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>?)
internal object RendererBadge {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("content")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Badge(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Badge(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      2 -> androidx.compose.material3.Badge(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      3 -> androidx.compose.material3.Badge(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      4 -> androidx.compose.material3.Badge(
        `modifier` = node.modifier("modifier", scope),
        `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content"), this) }),
      )
      5 -> androidx.compose.material3.Badge(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content"), this) }),
      )
      6 -> androidx.compose.material3.Badge(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content"), this) }),
      )
      7 -> androidx.compose.material3.Badge(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content"), this) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.BadgedBox(badge: kotlin.Function1<androidx.compose.foundation.layout.BoxScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, content: kotlin.Function1<androidx.compose.foundation.layout.BoxScope, kotlin.Unit>)
internal object RendererBadgedBox {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.material3.BadgedBox(
      `badge` = { RenderComposeChildren(node.slot("badge"), this) },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

// androidx.compose.material3.BasicAlertDialog(onDismissRequest: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, properties: androidx.compose.ui.window.DialogProperties, content: kotlin.Function0<kotlin.Unit>)
internal object RendererBasicAlertDialog {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.material3.BasicAlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.foundation.text.BasicSecureTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, textStyle: androidx.compose.ui.text.TextStyle, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, cursorBrush: androidx.compose.ui.graphics.Brush, decorator: androidx.compose.foundation.text.input.TextFieldDecorator?, textObfuscationMode: androidx.compose.foundation.text.input.TextObfuscationMode, textObfuscationCharacter: kotlin.Char)
internal object RendererBasicSecureTextField {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("cursorBrush")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      9 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      10 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      11 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      12 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      13 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      14 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      15 -> androidx.compose.foundation.text.BasicSecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.BasicText(text: kotlin.String, modifier: androidx.compose.ui.Modifier, style: androidx.compose.ui.text.TextStyle, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>?, overflow: androidx.compose.ui.text.style.TextOverflow, softWrap: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, color: androidx.compose.ui.graphics.ColorProducer?, autoSize: androidx.compose.foundation.text.TextAutoSize?)
internal object RendererBasicText {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("overflow")) 1 else 0) +
      (if (node.has("softWrap")) 2 else 0) +
      (if (node.has("maxLines")) 4 else 0) +
      (if (node.has("minLines")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      2 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
      )
      3 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      4 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      5 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      6 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      7 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      8 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      9 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      10 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      11 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      12 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      13 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      14 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      15 -> androidx.compose.foundation.text.BasicText(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
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
    val mask = (if (node.has("overflow")) 1 else 0) +
      (if (node.has("softWrap")) 2 else 0) +
      (if (node.has("maxLines")) 4 else 0) +
      (if (node.has("minLines")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      2 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
      )
      3 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      4 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      5 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      6 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      7 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      8 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      9 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      10 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      11 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      12 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      13 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      14 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      15 -> androidx.compose.foundation.text.BasicText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
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
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("cursorBrush")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      9 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      10 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      11 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      12 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      13 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      14 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      15 -> androidx.compose.foundation.text.BasicTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.BasicTextField(value: kotlin.String, onValueChange: kotlin.Function1<kotlin.String, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, keyboardActions: androidx.compose.foundation.text.KeyboardActions, singleLine: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, cursorBrush: androidx.compose.ui.graphics.Brush, decorationBox: kotlin.Function1<kotlin.Function0<kotlin.Unit>, kotlin.Unit>)
internal object RendererBasicTextField_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("singleLine")) 8 else 0) +
      (if (node.has("maxLines")) 16 else 0) +
      (if (node.has("minLines")) 32 else 0) +
      (if (node.has("cursorBrush")) 64 else 0)
    when (mask / 32) {
      0 -> renderBasicTextField_1Group0(node, scope, mask)
      1 -> renderBasicTextField_1Group1(node, scope, mask)
      2 -> renderBasicTextField_1Group2(node, scope, mask)
      3 -> renderBasicTextField_1Group3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
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
        `singleLine` = node.boolean("singleLine"),
      )
      9 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
      )
      10 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      11 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      12 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      13 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      14 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      15 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      16 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      17 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      18 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      19 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      20 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      21 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      22 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      23 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      24 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      25 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      26 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      27 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      28 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      29 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      30 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      31 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      33 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
      )
      34 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      35 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      36 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      37 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      38 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      39 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      40 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      41 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      42 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      43 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      44 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      45 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      46 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      47 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      48 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      49 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      50 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      51 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      52 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      53 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      54 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      55 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      56 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      57 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      58 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      59 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      60 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      61 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      62 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      63 -> androidx.compose.foundation.text.BasicTextField(
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
  private fun renderBasicTextField_1Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      65 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      66 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      67 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      68 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      69 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      70 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      71 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      72 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      73 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      74 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      75 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      76 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      77 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      78 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      79 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      80 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      81 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      82 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      83 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      84 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      85 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      86 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      87 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      88 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      89 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      90 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      91 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      92 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      93 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      94 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      95 -> androidx.compose.foundation.text.BasicTextField(
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
  private fun renderBasicTextField_1Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      97 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      98 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      99 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      100 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      101 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      102 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      103 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      104 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      105 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      106 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      107 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      108 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      109 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      110 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      111 -> androidx.compose.foundation.text.BasicTextField(
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
      112 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      113 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      114 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      115 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      116 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      117 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      118 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      119 -> androidx.compose.foundation.text.BasicTextField(
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
      120 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      121 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      122 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      123 -> androidx.compose.foundation.text.BasicTextField(
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
      124 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      125 -> androidx.compose.foundation.text.BasicTextField(
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
      126 -> androidx.compose.foundation.text.BasicTextField(
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
      127 -> androidx.compose.foundation.text.BasicTextField(
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
}

// androidx.compose.foundation.BasicTooltipBox(positionProvider: androidx.compose.ui.window.PopupPositionProvider, tooltip: kotlin.Function0<kotlin.Unit>, state: androidx.compose.foundation.BasicTooltipState, modifier: androidx.compose.ui.Modifier, focusable: kotlin.Boolean, enableUserInput: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererBasicTooltipBox {
  @OptIn(androidx.compose.foundation.ExperimentalFoundationApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val positionProviderValue = if (node.has("positionProvider") && !node.isNull("positionProvider")) node.jsonObject("positionProvider").rememberComposePopupPosition() else null
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeBasicTooltipState() else null
    val mask = (if (node.has("focusable")) 1 else 0) +
      (if (node.has("enableUserInput")) 2 else 0)
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
      (if (node.has("contentPadding")) 4 else 0)
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
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.Button(
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

// androidx.compose.material3.Card(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererCard {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Card(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererCard_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
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

// androidx.compose.material3.Checkbox(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.CheckboxColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererCheckbox {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0)
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
    val mask = (if (node.has("softWrap")) 1 else 0) +
      (if (node.has("overflow")) 2 else 0) +
      (if (node.has("maxLines")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      1 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      2 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      3 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      4 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      5 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      6 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      7 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
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

// androidx.compose.material3.DatePicker(state: androidx.compose.material3.DatePickerState, modifier: androidx.compose.ui.Modifier, dateFormatter: androidx.compose.material3.DatePickerFormatter, colors: androidx.compose.material3.DatePickerColors, title: kotlin.Function0<kotlin.Unit>?, headline: kotlin.Function0<kotlin.Unit>?, showModeToggle: kotlin.Boolean, focusRequester: androidx.compose.ui.focus.FocusRequester?)
internal object RendererDatePicker {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeDatePickerState() else null
    val mask = (if (node.has("dateFormatter")) 1 else 0) +
      (if (node.has("title")) 2 else 0) +
      (if (node.has("headline")) 4 else 0) +
      (if (node.has("showModeToggle")) 8 else 0)
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
      (if (node.has("showModeToggle")) 8 else 0)
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
