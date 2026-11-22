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

// androidx.compose.material3.carousel.HorizontalUncontainedCarousel(state: androidx.compose.material3.carousel.CarouselState, itemWidth: androidx.compose.ui.unit.Dp, modifier: androidx.compose.ui.Modifier, itemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function2<androidx.compose.material3.carousel.CarouselItemScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalUncontainedCarousel {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeCarouselState(node) else null
    val mask = (if (node.has("itemSpacing")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      1 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      2 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      3 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Icon(painter: androidx.compose.ui.graphics.painter.Painter, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, tint: androidx.compose.ui.graphics.Color)
internal object RendererIcon {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("tint")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Icon(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Icon(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `tint` = node.color("tint"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SegmentedButtonDefaults.Icon(active: kotlin.Boolean, activeContent: kotlin.Function0<kotlin.Unit>, inactiveContent: kotlin.Function0<kotlin.Unit>?)
internal object RendererIcon_1 {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("activeContent")) 1 else 0) +
      (if (node.has("inactiveContent")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SegmentedButtonDefaults.Icon(
        `active` = node.boolean("active"),
      )
      1 -> androidx.compose.material3.SegmentedButtonDefaults.Icon(
        `active` = node.boolean("active"),
        `activeContent` = { RenderComposeChildren(node.slot("activeContent")) },
      )
      2 -> androidx.compose.material3.SegmentedButtonDefaults.Icon(
        `active` = node.boolean("active"),
        `inactiveContent` = if (node.isNull("inactiveContent")) null else ({ RenderComposeChildren(node.slot("inactiveContent")) }),
      )
      3 -> androidx.compose.material3.SegmentedButtonDefaults.Icon(
        `active` = node.boolean("active"),
        `activeContent` = { RenderComposeChildren(node.slot("activeContent")) },
        `inactiveContent` = if (node.isNull("inactiveContent")) null else ({ RenderComposeChildren(node.slot("inactiveContent")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.IconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, shape: androidx.compose.ui.graphics.Shape, content: kotlin.Function0<kotlin.Unit>)
internal object RendererIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0) +
      (if (node.has("shape")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.IconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, shape: androidx.compose.ui.graphics.Shape, content: kotlin.Function0<kotlin.Unit>)
internal object RendererIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0) +
      (if (node.has("shape")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.Image(painter: androidx.compose.ui.graphics.painter.Painter, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, alignment: androidx.compose.ui.Alignment, contentScale: androidx.compose.ui.layout.ContentScale, alpha: kotlin.Float, colorFilter: androidx.compose.ui.graphics.ColorFilter?)
internal object RendererImage {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("alignment")) 1 else 0) +
      (if (node.has("contentScale")) 2 else 0) +
      (if (node.has("alpha")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
      )
      2 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
      )
      3 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
      )
      4 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alpha` = node.number("alpha").toFloat(),
      )
      5 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `alpha` = node.number("alpha").toFloat(),
      )
      6 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
      )
      7 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TabRowDefaults.Indicator(modifier: androidx.compose.ui.Modifier, height: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererIndicator {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("height")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TabRowDefaults.Indicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TabRowDefaults.Indicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
      )
      2 -> androidx.compose.material3.TabRowDefaults.Indicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.TabRowDefaults.Indicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(state: androidx.compose.material3.pulltorefresh.PullToRefreshState, isRefreshing: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, color: androidx.compose.ui.graphics.Color, threshold: androidx.compose.ui.unit.Dp)
internal object RendererIndicator_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("color")) 2 else 0) +
      (if (node.has("threshold")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      2 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `color` = node.color("color"),
      )
      4 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
      )
      5 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `threshold` = node.number("threshold").dp,
      )
      6 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `threshold` = node.number("threshold").dp,
      )
      7 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `color` = node.color("color"),
        `threshold` = node.number("threshold").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(state: androidx.compose.material3.pulltorefresh.PullToRefreshState, isRefreshing: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, threshold: androidx.compose.ui.unit.Dp, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.BoxScope, kotlin.Unit>)
internal object RendererIndicatorBox {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("threshold")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.InputChip(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, avatar: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SelectableChipColors, elevation: androidx.compose.material3.SelectableChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererInputChip {
  private fun decode_selected(node: ComposeNode) = node.boolean("selected")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_label: @Composable () -> Unit = { RenderComposeChildren(node.slot("label")) }
    val content_leadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingIcon")) }
    val slot_leadingIcon = if (node.isNull("leadingIcon")) null else content_leadingIcon
    val content_avatar: @Composable () -> Unit = { RenderComposeChildren(node.slot("avatar")) }
    val slot_avatar = if (node.isNull("avatar")) null else content_avatar
    val content_trailingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingIcon")) }
    val slot_trailingIcon = if (node.isNull("trailingIcon")) null else content_trailingIcon
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("avatar")) 4 else 0) +
      (if (node.has("trailingIcon")) 8 else 0) +
      (if (node.has("shape")) 16 else 0) +
      (if (node.has("elevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0) +
      (if (node.has("interactionSource")) 128 else 0)
    when (mask / 32) {
      0 -> renderInputChipGroup0(node, scope, mask, slot_label, slot_leadingIcon, slot_avatar, slot_trailingIcon)
      1 -> renderInputChipGroup1(node, scope, mask, slot_label, slot_leadingIcon, slot_avatar, slot_trailingIcon)
      2 -> renderInputChipGroup2(node, scope, mask, slot_label, slot_leadingIcon, slot_avatar, slot_trailingIcon)
      4 -> renderInputChipGroup4(node, scope, mask, slot_label, slot_leadingIcon, slot_avatar, slot_trailingIcon)
      6 -> renderInputChipGroup6(node, scope, mask, slot_label, slot_leadingIcon, slot_avatar, slot_trailingIcon)
      7 -> renderInputChipGroup7(node, scope, mask, slot_label, slot_leadingIcon, slot_avatar, slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_avatar: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      3 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      4 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar)
      5 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar)
      6 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar)
      7 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar)
      8 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      9 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      10 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      11 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      12 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon)
      13 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon)
      14 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon)
      15 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon)
      16 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      17 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      18 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      19 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      20 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"))
      21 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"))
      22 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"))
      23 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"))
      24 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      25 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      26 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      27 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      28 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      29 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      30 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      31 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_avatar: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      33 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      34 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      35 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      36 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      37 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      38 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      39 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      40 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      41 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      42 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      43 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      44 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      45 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      46 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      47 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      48 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      49 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      50 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      51 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      52 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      53 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      54 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      55 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      56 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      57 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      58 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      59 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      60 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      61 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      62 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      63 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_avatar: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      65 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      66 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      67 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      68 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      69 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      70 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      71 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      72 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      73 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      74 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      75 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      76 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      77 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      78 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      79 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      80 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      81 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      82 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      83 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      84 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      85 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      86 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      87 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      88 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      89 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      90 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      91 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      92 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      93 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      94 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      95 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup4(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_avatar: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      129 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      130 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      131 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      132 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      133 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      134 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      135 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      136 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      137 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      138 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      139 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      140 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      141 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      142 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      143 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      144 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      145 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      146 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      147 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      148 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      149 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      150 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      151 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      152 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      153 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      154 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      155 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      156 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      157 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      158 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      159 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup6(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_avatar: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      192 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      193 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      194 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      195 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      196 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      197 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      198 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      199 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      200 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      201 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      202 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      203 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      204 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      205 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      206 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      207 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      208 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      209 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      210 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      211 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      212 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      213 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      214 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      215 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      216 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      217 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      218 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      219 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      220 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      221 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      222 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      223 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup7(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_avatar: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      255 -> androidx.compose.material3.InputChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `avatar` = slot_avatar, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
