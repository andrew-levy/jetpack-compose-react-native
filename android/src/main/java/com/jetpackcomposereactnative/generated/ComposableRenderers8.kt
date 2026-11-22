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

// androidx.compose.material3.MediumExtendedFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererMediumExtendedFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
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

// androidx.compose.material3.MediumExtendedFloatingActionButton(text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expanded: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererMediumExtendedFloatingActionButton_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("expanded")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
      )
      2 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      5 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
      )
      6 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      7 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      8 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      9 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
      )
      10 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      11 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      12 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      13 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      14 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      15 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      16 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
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

// androidx.compose.material3.MediumFlexibleTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, subtitle: kotlin.Function0<kotlin.Unit>?, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, titleHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererMediumFlexibleTopAppBar {
  private fun decode_collapsedHeight(node: ComposeNode) = node.number("collapsedHeight").dp
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
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
      (if (node.has("windowInsets")) 64 else 0)
    when (mask / 32) {
      0 -> renderMediumFlexibleTopAppBarGroup0(node, scope, mask, slot_title, slot_subtitle, slot_navigationIcon)
      1 -> renderMediumFlexibleTopAppBarGroup1(node, scope, mask, slot_title, slot_subtitle, slot_navigationIcon)
      2 -> renderMediumFlexibleTopAppBarGroup2(node, scope, mask, slot_title, slot_subtitle, slot_navigationIcon)
      3 -> renderMediumFlexibleTopAppBarGroup3(node, scope, mask, slot_title, slot_subtitle, slot_navigationIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle)
      2 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon)
      3 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon)
      4 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      5 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      6 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      7 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      8 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      9 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      10 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      11 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      12 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      13 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      14 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      15 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      16 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node))
      17 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node))
      18 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node))
      19 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node))
      20 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      21 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      22 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      23 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      24 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      25 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      26 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      27 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      28 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      29 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      30 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      31 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node))
      33 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `expandedHeight` = decode_expandedHeight(node))
      34 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      35 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      36 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      37 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      38 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      39 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      40 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      41 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      42 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      43 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      44 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      45 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      46 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      47 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      48 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      49 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      50 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      51 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      52 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      53 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      54 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      55 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      56 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      57 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      58 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      59 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      60 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      61 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      62 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      63 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      65 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      66 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      67 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      68 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      69 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      70 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      71 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      72 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      73 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      74 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      75 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      76 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      77 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      78 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      79 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      80 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      81 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      82 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      83 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      84 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      85 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      86 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      87 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      88 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      89 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      90 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      91 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      92 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      93 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      94 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      95 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      97 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      98 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      99 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      100 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      101 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      102 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      103 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      104 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      105 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      106 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      107 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      108 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      109 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      110 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      111 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      112 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      113 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      114 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      115 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      116 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      117 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      118 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      119 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      120 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      121 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      122 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      123 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      124 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      125 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      126 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      127 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MediumFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererMediumFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.MediumFloatingActionButton(
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

// androidx.compose.material3.MediumTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererMediumTopAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("collapsedHeight")) 4 else 0) +
      (if (node.has("expandedHeight")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      2 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      3 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      4 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      5 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      6 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      7 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      8 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      9 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      10 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      11 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      12 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      13 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      14 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      15 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      16 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      17 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      18 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      19 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      20 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      21 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      22 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      23 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      24 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      25 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      26 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      27 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      28 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      29 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      30 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      31 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
