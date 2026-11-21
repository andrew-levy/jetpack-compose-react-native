// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.PlainTooltip as composeScoped0
import androidx.compose.material3.RichTooltip as composeScoped1
import androidx.compose.material3.SegmentedButton as composeScoped2

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
    val mask = (if (node.has("composeTextStyle")) 1 else 0) +
      (if (node.has("softWrap")) 2 else 0) +
      (if (node.has("overflow")) 4 else 0) +
      (if (node.has("maxLines")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      1 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      2 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      3 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      4 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      5 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      6 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      7 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      8 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      9 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      10 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      11 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      12 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      13 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      14 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      15 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
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
      (if (node.has("showModeToggle")) 8 else 0) +
      (if (node.has("focusRequester")) 16 else 0)
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
      16 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      17 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      18 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      19 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      20 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      21 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      22 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      23 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      24 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      25 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      26 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      27 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      28 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      29 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      30 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      31 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
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
      (if (node.has("showModeToggle")) 8 else 0) +
      (if (node.has("focusRequester")) 16 else 0)
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
      16 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      17 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      18 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      19 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      20 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      21 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      22 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      23 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      24 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      25 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      26 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      27 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      28 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      29 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      30 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      31 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
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

// androidx.compose.material3.DismissibleDrawerSheet(modifier: androidx.compose.ui.Modifier, drawerShape: androidx.compose.ui.graphics.Shape, drawerContainerColor: androidx.compose.ui.graphics.Color, drawerContentColor: androidx.compose.ui.graphics.Color, drawerTonalElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererDismissibleDrawerSheet {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("drawerShape")) 1 else 0) +
      (if (node.has("drawerContainerColor")) 2 else 0) +
      (if (node.has("drawerContentColor")) 4 else 0) +
      (if (node.has("drawerTonalElevation")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.DismissibleDrawerSheet(
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

// androidx.compose.material3.DismissibleNavigationDrawer(drawerContent: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, drawerState: androidx.compose.material3.DrawerState, gesturesEnabled: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererDismissibleNavigationDrawer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("gesturesEnabled")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DismissibleNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.DismissibleNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Divider(modifier: androidx.compose.ui.Modifier, thickness: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererDivider {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("thickness")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Divider(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Divider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
      )
      2 -> androidx.compose.material3.Divider(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.Divider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DockedSearchBar(inputField: kotlin.Function0<kotlin.Unit>, expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererDockedSearchBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("tonalElevation")) 2 else 0) +
      (if (node.has("shadowElevation")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
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

// androidx.compose.material3.BottomSheetDefaults.DragHandle(modifier: androidx.compose.ui.Modifier, width: androidx.compose.ui.unit.Dp, height: androidx.compose.ui.unit.Dp, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color)
internal object RendererDragHandle {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("width")) 1 else 0) +
      (if (node.has("height")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("color")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
      )
      2 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
      )
      3 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
      )
      4 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      5 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `shape` = node.arguments().shape("shape"),
      )
      6 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
      )
      7 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
      )
      8 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      9 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `color` = node.color("color"),
      )
      10 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      11 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      12 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
      )
      13 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
      )
      14 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
      )
      15 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DropdownMenu(expanded: kotlin.Boolean, onDismissRequest: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, offset: androidx.compose.ui.unit.DpOffset, scrollState: androidx.compose.foundation.ScrollState, properties: androidx.compose.ui.window.PopupProperties, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererDropdownMenu {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("offset")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("tonalElevation")) 8 else 0) +
      (if (node.has("shadowElevation")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DropdownMenuItem(text: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, enabled: kotlin.Boolean, colors: androidx.compose.material3.MenuItemColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererDropdownMenuItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("leadingIcon")) 1 else 0) +
      (if (node.has("trailingIcon")) 2 else 0) +
      (if (node.has("enabled")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      2 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      3 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      4 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      5 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `enabled` = node.boolean("enabled"),
      )
      6 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
      )
      7 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
      )
      8 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      9 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      10 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      11 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      12 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      13 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      14 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      15 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedAssistChip(onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ChipColors, elevation: androidx.compose.material3.ChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererElevatedAssistChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("trailingIcon")) 4 else 0) +
      (if (node.has("shape")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      3 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      4 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      5 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      6 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      7 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      8 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      9 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      10 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      11 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      12 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      13 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      14 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      15 -> androidx.compose.material3.ElevatedAssistChip(
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

// androidx.compose.material3.ElevatedButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererElevatedButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ElevatedButton(
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

// androidx.compose.material3.ElevatedCard(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererElevatedCard {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedCard(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ElevatedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedCard(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererElevatedCard_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ElevatedCard(
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

// androidx.compose.material3.ElevatedFilterChip(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SelectableChipColors, elevation: androidx.compose.material3.SelectableChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererElevatedFilterChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("trailingIcon")) 4 else 0) +
      (if (node.has("shape")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      3 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      4 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      5 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      6 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      7 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      8 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      9 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      10 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      11 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      12 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      13 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      14 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      15 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
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

// androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererElevatedLeadingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0)
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
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
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

// androidx.compose.material3.ElevatedSuggestionChip(onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, icon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ChipColors, elevation: androidx.compose.material3.ChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererElevatedSuggestionChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("icon")) 2 else 0) +
      (if (node.has("shape")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      3 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      4 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      5 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      6 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      7 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
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
      (if (node.has("contentPadding")) 2 else 0)
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
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
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
      (if (node.has("contentPadding")) 2 else 0)
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
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.ExposedDropdownMenuBoxScope) {
    val mask = (if (node.has("matchAnchorWidth")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("tonalElevation")) 8 else 0) +
      (if (node.has("shadowElevation")) 16 else 0)
    when (mask) {
      0 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> scope.ExposedDropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `matchAnchorWidth` = node.boolean("matchAnchorWidth"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
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
      (if (node.has("contentColor")) 4 else 0)
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
      (if (node.has("contentColor")) 8 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledIconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledTonalButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererFilledTonalButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.FilledTonalButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.FilledTonalButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.FilledTonalButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.FilledTonalButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.FilledTonalButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.FilledTonalButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.FilledTonalButton(
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

// androidx.compose.material3.FilledTonalIconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledTonalIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledTonalIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledTonalIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilterChip(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SelectableChipColors, elevation: androidx.compose.material3.SelectableChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererFilterChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("trailingIcon")) 4 else 0) +
      (if (node.has("shape")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      3 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      4 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      5 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      6 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      7 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      8 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      9 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      10 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      11 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      12 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      13 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      14 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      15 -> androidx.compose.material3.FilterChip(
        `selected` = node.boolean("selected"),
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

// androidx.compose.material3.FlexibleBottomAppBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, contentPadding: androidx.compose.foundation.layout.PaddingValues, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, scrollBehavior: androidx.compose.material3.BottomAppBarScrollBehavior?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererFlexibleBottomAppBar {
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
      0 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderFlexibleBottomAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      33 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      34 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      35 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      36 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      37 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      38 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      39 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      40 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      41 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      42 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      43 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      44 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      45 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      46 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      47 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      48 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      49 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      50 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      51 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      52 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      53 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      54 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      55 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      56 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      57 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      58 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      59 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      60 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      61 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      62 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      63 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
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
      (if (node.has("contentColor")) 4 else 0)
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
      0 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderHorizontalFloatingToolbarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      33 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      34 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      35 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      36 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      37 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      38 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      39 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      40 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      41 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      42 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      43 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      44 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      45 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      46 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      47 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      48 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      49 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      50 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      51 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      52 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      53 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      54 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      55 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      56 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      57 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      58 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      59 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      60 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      61 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      62 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      63 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
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

// androidx.compose.foundation.pager.HorizontalPager(state: androidx.compose.foundation.pager.PagerState, modifier: androidx.compose.ui.Modifier, contentPadding: androidx.compose.foundation.layout.PaddingValues, pageSize: androidx.compose.foundation.pager.PageSize, beyondViewportPageCount: kotlin.Int, pageSpacing: androidx.compose.ui.unit.Dp, verticalAlignment: androidx.compose.ui.Alignment.Vertical, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, userScrollEnabled: kotlin.Boolean, reverseLayout: kotlin.Boolean, key: kotlin.Function1<kotlin.Int, kotlin.Any>?, pageNestedScrollConnection: androidx.compose.ui.input.nestedscroll.NestedScrollConnection, snapPosition: androidx.compose.foundation.gestures.snapping.SnapPosition, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, pageContent: kotlin.Function2<androidx.compose.foundation.pager.PagerScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalPager {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposePagerState(node) else null
    val mask = (if (node.has("contentPadding")) 1 else 0) +
      (if (node.has("beyondViewportPageCount")) 2 else 0) +
      (if (node.has("pageSpacing")) 4 else 0) +
      (if (node.has("verticalAlignment")) 8 else 0) +
      (if (node.has("userScrollEnabled")) 16 else 0) +
      (if (node.has("reverseLayout")) 32 else 0) +
      (if (node.has("pageNestedScrollConnection")) 64 else 0)
    when (mask / 32) {
      0 -> renderHorizontalPagerGroup0(node, scope, mask, stateValue)
      1 -> renderHorizontalPagerGroup1(node, scope, mask, stateValue)
      2 -> renderHorizontalPagerGroup2(node, scope, mask, stateValue)
      3 -> renderHorizontalPagerGroup3(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      0 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      1 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      2 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      3 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      4 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      5 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      6 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      7 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      8 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      9 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      10 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      11 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      12 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      13 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      14 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      15 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      16 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      17 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      18 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      19 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      20 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      21 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      22 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      23 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      24 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      25 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      26 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      27 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      28 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      29 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      30 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      31 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      32 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      33 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      34 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      35 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      36 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      37 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      38 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      39 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      40 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      41 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      42 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      43 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      44 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      45 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      46 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      47 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      48 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      49 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      50 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      51 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      52 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      53 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      54 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      55 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      56 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      57 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      58 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      59 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      60 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      61 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      62 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      63 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      64 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      65 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      66 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      67 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      68 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      69 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      70 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      71 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      72 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      73 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      74 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      75 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      76 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      77 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      78 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      79 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      80 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      81 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      82 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      83 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      84 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      85 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      86 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      87 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      88 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      89 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      90 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      91 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      92 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      93 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      94 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      95 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      96 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      97 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      98 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      99 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      100 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      101 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      102 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      103 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      104 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      105 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      106 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      107 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      108 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      109 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      110 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      111 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      112 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      113 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      114 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      115 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      116 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      117 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      118 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      119 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      120 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      121 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      122 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      123 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      124 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      125 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      126 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      127 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
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
      (if (node.has("shape")) 2 else 0)
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
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconButton(
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

// androidx.compose.material3.IconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, shape: androidx.compose.ui.graphics.Shape, content: kotlin.Function0<kotlin.Unit>)
internal object RendererIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0)
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
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconToggleButton(
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

// androidx.compose.material3.InputChip(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, avatar: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SelectableChipColors, elevation: androidx.compose.material3.SelectableChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererInputChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("avatar")) 4 else 0) +
      (if (node.has("trailingIcon")) 8 else 0) +
      (if (node.has("shape")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      3 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      4 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      )
      5 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      )
      6 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      )
      7 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      )
      8 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      9 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      10 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      11 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      12 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      13 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      14 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      15 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      16 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      17 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      18 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      19 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      20 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
      )
      21 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
      )
      22 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
      )
      23 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
      )
      24 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      25 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      26 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      27 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      28 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      29 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      30 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      31 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

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
      (if (node.has("shape")) 256 else 0)
    when (mask / 32) {
      0 -> renderInputFieldGroup0(node, scope, mask, textFieldStateValue, searchBarStateValue)
      1 -> renderInputFieldGroup1(node, scope, mask, textFieldStateValue, searchBarStateValue)
      2 -> renderInputFieldGroup2(node, scope, mask, textFieldStateValue, searchBarStateValue)
      4 -> renderInputFieldGroup4(node, scope, mask, textFieldStateValue, searchBarStateValue)
      8 -> renderInputFieldGroup8(node, scope, mask, textFieldStateValue, searchBarStateValue)
      15 -> renderInputFieldGroup15(node, scope, mask, textFieldStateValue, searchBarStateValue)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputFieldGroup15(node: ComposeNode, scope: Any?, mask: Int, textFieldStateValue: androidx.compose.foundation.text.input.TextFieldState?, searchBarStateValue: androidx.compose.material3.SearchBarState?) {
    when (mask) {
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
}

// androidx.compose.material3.SearchBarDefaults.InputField(state: androidx.compose.foundation.text.input.TextFieldState, onSearch: kotlin.Function1<kotlin.String, kotlin.Unit>, expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, outputTransformation: androidx.compose.foundation.text.input.OutputTransformation?, scrollState: androidx.compose.foundation.ScrollState, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererInputField_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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
      (if (node.has("shape")) 256 else 0)
    when (mask / 32) {
      0 -> renderInputField_1Group0(node, scope, mask, stateValue)
      1 -> renderInputField_1Group1(node, scope, mask, stateValue)
      2 -> renderInputField_1Group2(node, scope, mask, stateValue)
      4 -> renderInputField_1Group4(node, scope, mask, stateValue)
      8 -> renderInputField_1Group8(node, scope, mask, stateValue)
      15 -> renderInputField_1Group15(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputField_1Group0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      0 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      9 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      10 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      11 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      12 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      13 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      14 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      15 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      16 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      17 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      18 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      19 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      20 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      21 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      22 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      23 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      24 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      25 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      26 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      27 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      28 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      29 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      30 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      31 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
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
  private fun renderInputField_1Group1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      32 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      33 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      34 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      35 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      40 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      41 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      42 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      43 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      48 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      49 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      50 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      51 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      56 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      57 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      58 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      59 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputField_1Group2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      64 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      65 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      66 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      67 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      72 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      73 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      74 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      75 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      80 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      81 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      82 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      83 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      88 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      89 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      90 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      91 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputField_1Group4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      128 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      129 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      130 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      131 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      136 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      137 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      138 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      139 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      144 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      145 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      146 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      147 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      152 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      153 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      154 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      155 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputField_1Group8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      256 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      257 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      258 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      259 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      264 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      265 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      266 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      267 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      272 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      273 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      274 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      275 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      280 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      281 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      282 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      283 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderInputField_1Group15(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      511 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `state` = requireNotNull(stateValue),
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
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
}

// androidx.compose.material3.SearchBarDefaults.InputField(query: kotlin.String, onQueryChange: kotlin.Function1<kotlin.String, kotlin.Unit>, onSearch: kotlin.Function1<kotlin.String, kotlin.Unit>, expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.TextFieldColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererInputField_2 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("placeholder")) 2 else 0) +
      (if (node.has("leadingIcon")) 4 else 0) +
      (if (node.has("trailingIcon")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      3 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      4 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      5 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      6 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      7 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      8 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      9 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      10 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      11 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      12 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      13 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      14 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      15 -> androidx.compose.material3.SearchBarDefaults.InputField(
        `query` = node.string("query"),
        `onQueryChange` = { value: String -> node.emit("onQueryChange", value) },
        `onSearch` = { value: String -> node.emit("onSearch", value) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Label(label: kotlin.Function1<androidx.compose.material3.TooltipScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, isPersistent: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererLabel {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("isPersistent")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Label(
        `label` = { RenderComposeChildren(node.slot("label"), this) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.Label(
        `label` = { RenderComposeChildren(node.slot("label"), this) },
        `modifier` = node.modifier("modifier", scope),
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
      (if (node.has("contentColor")) 4 else 0)
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
      (if (node.has("contentColor")) 8 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LargeFlexibleTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, subtitle: kotlin.Function0<kotlin.Unit>?, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, titleHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererLargeFlexibleTopAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("subtitle")) 1 else 0) +
      (if (node.has("navigationIcon")) 2 else 0) +
      (if (node.has("actions")) 4 else 0) +
      (if (node.has("titleHorizontalAlignment")) 8 else 0) +
      (if (node.has("collapsedHeight")) 16 else 0) +
      (if (node.has("expandedHeight")) 32 else 0) +
      (if (node.has("windowInsets")) 64 else 0)
    when (mask / 32) {
      0 -> renderLargeFlexibleTopAppBarGroup0(node, scope, mask)
      1 -> renderLargeFlexibleTopAppBarGroup1(node, scope, mask)
      2 -> renderLargeFlexibleTopAppBarGroup2(node, scope, mask)
      3 -> renderLargeFlexibleTopAppBarGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
      )
      2 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      3 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      4 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      5 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      6 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      7 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      8 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      9 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      10 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      11 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      12 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      13 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      14 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      15 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      16 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      17 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      18 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      19 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      20 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      21 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      22 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      23 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      24 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      25 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      26 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      27 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      28 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      29 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      30 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      31 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      33 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      34 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      35 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      36 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      37 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      38 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      39 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      40 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      41 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      42 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      43 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      44 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      45 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      46 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      47 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      48 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      49 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      50 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      51 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      52 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      53 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      54 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      55 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      56 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      57 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      58 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      59 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      60 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      61 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      62 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      63 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      65 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      66 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      67 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      68 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      69 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      70 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      71 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      72 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      73 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      74 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      75 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      76 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      77 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      78 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      79 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      80 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      81 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      82 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      83 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      84 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      85 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      86 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      87 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      88 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      89 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      90 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      91 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      92 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      93 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      94 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      95 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      97 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      98 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      99 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      100 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      101 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      102 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      103 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      104 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      105 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      106 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      107 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      108 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      109 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      110 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      111 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      112 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      113 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      114 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      115 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      116 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      117 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      118 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      119 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      120 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      121 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      122 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      123 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      124 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      125 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      126 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      127 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
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
      (if (node.has("contentColor")) 4 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LargeTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererLargeTopAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("collapsedHeight")) 4 else 0) +
      (if (node.has("expandedHeight")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      2 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      3 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      4 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      5 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      6 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      7 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      8 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      9 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      10 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      11 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      12 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      13 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      14 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      15 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      16 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      17 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      18 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      19 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      20 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      21 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      22 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      23 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      24 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      25 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      26 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      27 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      28 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      29 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      30 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      31 -> androidx.compose.material3.LargeTopAppBar(
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

// androidx.compose.foundation.lazy.LazyColumn(modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.LazyListState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalAlignment: androidx.compose.ui.Alignment.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>)
internal object RendererLazyColumn {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyListState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalArrangement")) 8 else 0) +
      (if (node.has("horizontalAlignment")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0)
    when (mask / 32) {
      0 -> renderLazyColumnGroup0(node, scope, mask, stateValue)
      1 -> renderLazyColumnGroup1(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      40 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      41 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      42 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      43 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      44 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      45 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      46 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      47 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      48 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      49 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      50 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      51 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      52 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      53 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      54 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      55 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      56 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      57 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      58 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      59 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      60 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      61 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      62 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      63 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(rows: androidx.compose.foundation.lazy.grid.GridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.grid.LazyGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit>)
internal object RendererLazyHorizontalGrid {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyGridState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("horizontalArrangement")) 8 else 0) +
      (if (node.has("verticalArrangement")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0)
    when (mask / 32) {
      0 -> renderLazyHorizontalGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyHorizontalGridGroup1(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      40 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      41 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      42 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      43 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      44 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      45 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      46 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      47 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      48 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      49 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      50 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      51 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      52 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      53 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      54 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      55 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      56 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      57 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      58 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      59 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      60 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      61 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      62 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      63 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(rows: androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalItemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit>)
internal object RendererLazyHorizontalStaggeredGrid {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyStaggeredGridState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalArrangement")) 8 else 0) +
      (if (node.has("horizontalItemSpacing")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0)
    when (mask / 32) {
      0 -> renderLazyHorizontalStaggeredGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyHorizontalStaggeredGridGroup1(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      40 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      41 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      42 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      43 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      44 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      45 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      46 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      47 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      48 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      49 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      50 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      51 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      52 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      53 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      54 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      55 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      56 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      57 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      58 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      59 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      60 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      61 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      62 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      63 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.LazyRow(modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.LazyListState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalAlignment: androidx.compose.ui.Alignment.Vertical, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>)
internal object RendererLazyRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyListState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("horizontalArrangement")) 8 else 0) +
      (if (node.has("verticalAlignment")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0)
    when (mask / 32) {
      0 -> renderLazyRowGroup0(node, scope, mask, stateValue)
      1 -> renderLazyRowGroup1(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      40 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      41 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      42 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      43 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      44 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      45 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      46 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      47 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      48 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      49 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      50 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      51 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      52 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      53 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      54 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      55 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      56 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      57 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      58 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      59 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      60 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      61 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      62 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      63 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.grid.LazyVerticalGrid(columns: androidx.compose.foundation.lazy.grid.GridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.grid.LazyGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit>)
internal object RendererLazyVerticalGrid {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyGridState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalArrangement")) 8 else 0) +
      (if (node.has("horizontalArrangement")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0)
    when (mask / 32) {
      0 -> renderLazyVerticalGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyVerticalGridGroup1(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      40 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      41 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      42 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      43 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      44 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      45 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      46 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      47 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      48 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      49 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      50 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      51 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      52 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      53 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      54 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      55 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      56 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      57 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      58 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      59 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      60 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      61 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      62 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      63 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(columns: androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalItemSpacing: androidx.compose.ui.unit.Dp, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit>)
internal object RendererLazyVerticalStaggeredGrid {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyStaggeredGridState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalItemSpacing")) 8 else 0) +
      (if (node.has("horizontalArrangement")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0)
    when (mask / 32) {
      0 -> renderLazyVerticalStaggeredGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyVerticalStaggeredGridGroup1(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      40 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      41 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      42 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      43 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      44 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      45 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      46 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      47 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      48 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      49 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      50 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      51 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      52 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      53 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      54 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      55 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      56 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      57 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      58 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      59 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      60 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      61 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      62 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      63 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
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
      (if (node.has("contentPadding")) 2 else 0)
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
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
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

// androidx.compose.material3.LeadingIconTab(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, selectedContentColor: androidx.compose.ui.graphics.Color, unselectedContentColor: androidx.compose.ui.graphics.Color, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererLeadingIconTab {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("selectedContentColor")) 2 else 0) +
      (if (node.has("unselectedContentColor")) 4 else 0)
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
      (if (node.has("gapSize")) 4 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearWavyProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Float, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererLinearWavyProgressIndicator {
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
      0 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      8 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      9 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      10 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      11 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      12 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      13 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      14 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      15 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      16 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
      )
      17 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
      )
      18 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      19 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      20 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      21 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      22 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      23 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      24 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      25 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      26 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      27 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      28 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      29 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      30 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      31 -> androidx.compose.material3.LinearWavyProgressIndicator(
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
  private fun renderLinearWavyProgressIndicatorGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      33 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      34 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      35 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      36 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      37 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      38 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      39 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      40 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      41 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      42 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      43 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      44 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      45 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      46 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      47 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      48 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      49 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      50 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      51 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      52 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      53 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      54 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      55 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      56 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      57 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      58 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      59 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      60 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      61 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      62 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      63 -> androidx.compose.material3.LinearWavyProgressIndicator(
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

// androidx.compose.material3.LinearWavyProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, stopSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Function1<kotlin.Float, kotlin.Float>, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererLinearWavyProgressIndicator_1 {
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
      0 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      8 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `stopSize` = node.number("stopSize").dp,
      )
      9 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `stopSize` = node.number("stopSize").dp,
      )
      10 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
      )
      11 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
      )
      12 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
      )
      13 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
      )
      14 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
      )
      15 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
      )
      16 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
      )
      17 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
      )
      18 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      19 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      20 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      21 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      22 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      23 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      24 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      25 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      26 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      27 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      28 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      29 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      30 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      31 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicator_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      33 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      34 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      35 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      36 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      37 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      38 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      39 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      40 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      41 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      42 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      43 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      44 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      45 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      46 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      47 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      48 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      49 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      50 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      51 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      52 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      53 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      54 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      55 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      56 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      57 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      58 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      59 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      60 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      61 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      62 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      63 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ListItem(headlineContent: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, overlineContent: kotlin.Function0<kotlin.Unit>?, supportingContent: kotlin.Function0<kotlin.Unit>?, leadingContent: kotlin.Function0<kotlin.Unit>?, trailingContent: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.ListItemColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp)
internal object RendererListItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("overlineContent")) 1 else 0) +
      (if (node.has("supportingContent")) 2 else 0) +
      (if (node.has("leadingContent")) 4 else 0) +
      (if (node.has("trailingContent")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0)
    when (mask / 32) {
      0 -> renderListItemGroup0(node, scope, mask)
      1 -> renderListItemGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderListItemGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      )
      2 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      )
      3 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      )
      4 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      )
      5 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      )
      6 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      )
      7 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      )
      8 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      9 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      10 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      11 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      12 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      13 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      14 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      15 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      16 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      17 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      18 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      19 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      20 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      21 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      22 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      23 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      24 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      25 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      26 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      27 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      28 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      29 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      30 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      31 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderListItemGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      33 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      34 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      35 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      36 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      37 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      38 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      39 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      40 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      41 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      42 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      43 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      44 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      45 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      46 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      47 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      48 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      49 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      50 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      51 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      52 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      53 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      54 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      55 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      56 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      57 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      58 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      59 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      60 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      61 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      62 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      63 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LoadingIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, polygons: kotlin.collections.List<androidx.graphics.shapes.RoundedPolygon>)
internal object RendererLoadingIndicator {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LoadingIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, polygons: kotlin.collections.List<androidx.graphics.shapes.RoundedPolygon>)
internal object RendererLoadingIndicator_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.ui.layout.LookaheadScope(content: kotlin.Function1<androidx.compose.ui.layout.LookaheadScope, kotlin.Unit>)
internal object RendererLookaheadScope {
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.ui.layout.LookaheadScope(
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

// androidx.compose.material3.MaterialExpressiveTheme(colorScheme: androidx.compose.material3.ColorScheme?, motionScheme: androidx.compose.material3.MotionScheme?, shapes: androidx.compose.material3.Shapes?, typography: androidx.compose.material3.Typography?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererMaterialExpressiveTheme {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("colorScheme")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MaterialExpressiveTheme(
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.MaterialExpressiveTheme(
        `colorScheme` = if (node.isNull("colorScheme")) null else (node.jsonObject("colorScheme").toColorScheme()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MaterialTheme(colorScheme: androidx.compose.material3.ColorScheme, shapes: androidx.compose.material3.Shapes, typography: androidx.compose.material3.Typography, content: kotlin.Function0<kotlin.Unit>)
internal object RendererMaterialTheme {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("colorScheme")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MaterialTheme(
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.MaterialTheme(
        `colorScheme` = node.jsonObject("colorScheme").toColorScheme(),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MediumExtendedFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererMediumExtendedFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0)
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
      (if (node.has("contentColor")) 8 else 0)
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
