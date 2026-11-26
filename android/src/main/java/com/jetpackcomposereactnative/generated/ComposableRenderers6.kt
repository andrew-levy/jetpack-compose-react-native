// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.adaptive.layout.AnimatedPane as composeScoped0
import androidx.compose.material3.ExposedDropdownMenu as composeScoped1
import androidx.compose.material3.FloatingActionButtonMenuItem as composeScoped2
import androidx.compose.material3.NavigationBarItem as composeScoped3
import androidx.compose.material3.PlainTooltip as composeScoped4
import androidx.compose.material3.RichTooltip as composeScoped5
import androidx.compose.material3.SegmentedButton as composeScoped6

// androidx.compose.material3.CircularWavyProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Float, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererCircularWavyProgressIndicator {
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_trackColor(node: ComposeNode) = node.color("trackColor")
  private fun decode_gapSize(node: ComposeNode) = node.number("gapSize").dp
  private fun decode_amplitude(node: ComposeNode) = node.number("amplitude").toFloat()
  private fun decode_wavelength(node: ComposeNode) = node.number("wavelength").dp
  private fun decode_waveSpeed(node: ComposeNode) = node.number("waveSpeed").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("stroke")) 4 else 0) +
      (if (node.has("trackStroke")) 8 else 0) +
      (if (node.has("gapSize")) 16 else 0) +
      (if (node.has("amplitude")) 32 else 0) +
      (if (node.has("wavelength")) 64 else 0) +
      (if (node.has("waveSpeed")) 128 else 0)
    when (mask / 32) {
      0 -> renderCircularWavyProgressIndicatorGroup0(node, scope, mask)
      1 -> renderCircularWavyProgressIndicatorGroup1(node, scope, mask)
      2 -> renderCircularWavyProgressIndicatorGroup2(node, scope, mask)
      3 -> renderCircularWavyProgressIndicatorGroup3(node, scope, mask)
      4 -> renderCircularWavyProgressIndicatorGroup4(node, scope, mask)
      5 -> renderCircularWavyProgressIndicatorGroup5(node, scope, mask)
      6 -> renderCircularWavyProgressIndicatorGroup6(node, scope, mask)
      7 -> renderCircularWavyProgressIndicatorGroup7(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node))
      3 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node))
      4 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      5 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      6 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      7 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      8 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      9 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      10 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      11 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      12 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      13 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      14 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      15 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      16 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node))
      17 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node))
      18 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      19 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      20 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      21 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      22 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      23 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      24 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      25 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      26 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      27 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      28 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      29 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      30 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      31 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node))
      33 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node))
      34 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      35 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      36 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      37 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      38 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      39 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      40 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      41 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      42 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      43 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      44 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      45 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      46 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      47 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      48 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      49 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      50 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      51 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      52 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      53 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      54 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      55 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      56 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      57 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      58 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      59 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      60 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      61 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      62 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      63 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node))
      65 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node))
      66 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      67 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      68 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      69 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      70 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      71 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      72 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      73 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      74 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      75 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      76 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      77 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      78 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      79 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      80 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      81 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      82 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      83 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      84 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      85 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      86 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      87 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      88 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      89 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      90 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      91 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      92 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      93 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      94 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      95 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      97 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      98 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      99 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      100 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      101 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      102 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      103 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      104 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      105 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      106 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      107 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      108 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      109 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      110 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      111 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      112 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      113 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      114 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      115 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      116 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      117 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      118 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      119 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      120 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      121 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      122 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      123 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      124 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      125 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      126 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      127 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `waveSpeed` = decode_waveSpeed(node))
      129 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `waveSpeed` = decode_waveSpeed(node))
      130 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      131 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      132 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      133 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      134 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      135 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      136 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      137 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      138 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      139 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      140 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      141 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      142 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      143 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      144 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      145 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      146 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      147 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      148 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      149 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      150 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      151 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      152 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      153 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      154 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      155 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      156 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      157 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      158 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      159 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      161 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      162 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      163 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      164 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      165 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      166 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      167 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      168 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      169 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      170 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      171 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      172 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      173 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      174 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      175 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      176 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      177 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      178 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      179 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      180 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      181 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      182 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      183 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      184 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      185 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      186 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      187 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      188 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      189 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      190 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      191 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      193 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      194 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      195 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      196 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      197 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      198 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      199 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      200 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      201 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      202 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      203 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      204 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      205 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      206 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      207 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      208 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      209 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      210 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      211 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      212 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      213 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      214 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      215 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      216 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      217 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      218 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      219 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      220 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      221 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      222 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      223 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      225 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      226 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      227 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      228 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      229 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      230 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      231 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      232 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      233 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      234 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      235 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      236 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      237 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      238 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      239 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      240 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      241 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      242 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      243 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      244 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      245 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      246 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      247 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      248 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      249 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      250 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      251 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      252 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      253 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      254 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      255 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CircularWavyProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Function1<kotlin.Float, kotlin.Float>, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererCircularWavyProgressIndicator_1 {
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_trackColor(node: ComposeNode) = node.color("trackColor")
  private fun decode_gapSize(node: ComposeNode) = node.number("gapSize").dp
  private fun decode_wavelength(node: ComposeNode) = node.number("wavelength").dp
  private fun decode_waveSpeed(node: ComposeNode) = node.number("waveSpeed").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("stroke")) 4 else 0) +
      (if (node.has("trackStroke")) 8 else 0) +
      (if (node.has("gapSize")) 16 else 0) +
      (if (node.has("amplitude")) 32 else 0) +
      (if (node.has("wavelength")) 64 else 0) +
      (if (node.has("waveSpeed")) 128 else 0)
    when (mask / 32) {
      0 -> renderCircularWavyProgressIndicator_1Group0(node, scope, mask)
      1 -> renderCircularWavyProgressIndicator_1Group1(node, scope, mask)
      2 -> renderCircularWavyProgressIndicator_1Group2(node, scope, mask)
      3 -> renderCircularWavyProgressIndicator_1Group3(node, scope, mask)
      4 -> renderCircularWavyProgressIndicator_1Group4(node, scope, mask)
      5 -> renderCircularWavyProgressIndicator_1Group5(node, scope, mask)
      6 -> renderCircularWavyProgressIndicator_1Group6(node, scope, mask)
      7 -> renderCircularWavyProgressIndicator_1Group7(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node))
      3 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node))
      4 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      5 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      6 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      7 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      8 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      9 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      10 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      11 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      12 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      13 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      14 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      15 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      16 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node))
      17 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node))
      18 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      19 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      20 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      21 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      22 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      23 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      24 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      25 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      26 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      27 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      28 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      29 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      30 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      31 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      33 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      34 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      35 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      36 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      37 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      38 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      39 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      40 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      41 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      42 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      43 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      44 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      45 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      46 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      47 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      48 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      49 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      50 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      51 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      52 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      53 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      54 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      55 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      56 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      57 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      58 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      59 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      60 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      61 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      62 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      63 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node))
      65 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node))
      66 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      67 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      68 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      69 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      70 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      71 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      72 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      73 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      74 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      75 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      76 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      77 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      78 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      79 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      80 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      81 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      82 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      83 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      84 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      85 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      86 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      87 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      88 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      89 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      90 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      91 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      92 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      93 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      94 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      95 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      97 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      98 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      99 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      100 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      101 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      102 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      103 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      104 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      105 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      106 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      107 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      108 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      109 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      110 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      111 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      112 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      113 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      114 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      115 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      116 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      117 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      118 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      119 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      120 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      121 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      122 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      123 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      124 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      125 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      126 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      127 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `waveSpeed` = decode_waveSpeed(node))
      129 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `waveSpeed` = decode_waveSpeed(node))
      130 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      131 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      132 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      133 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      134 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      135 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      136 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      137 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      138 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      139 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      140 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      141 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      142 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      143 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      144 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      145 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      146 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      147 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      148 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      149 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      150 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      151 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      152 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      153 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      154 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      155 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      156 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      157 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      158 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      159 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      161 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      162 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      163 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      164 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      165 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      166 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      167 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      168 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      169 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      170 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      171 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      172 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      173 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      174 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      175 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      176 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      177 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      178 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      179 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      180 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      181 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      182 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      183 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      184 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      185 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      186 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      187 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      188 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      189 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      190 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      191 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      193 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      194 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      195 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      196 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      197 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      198 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      199 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      200 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      201 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      202 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      203 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      204 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      205 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      206 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      207 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      208 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      209 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      210 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      211 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      212 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      213 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      214 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      215 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      216 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      217 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      218 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      219 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      220 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      221 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      222 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      223 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      225 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      226 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      227 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      228 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      229 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      230 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      231 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      232 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      233 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      234 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      235 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      236 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      237 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      238 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      239 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      240 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      241 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      242 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      243 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      244 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      245 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      246 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      247 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      248 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      249 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      250 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      251 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      252 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      253 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      254 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      255 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = node.arguments().jsonArray("amplitude").toComposeInterpolation<kotlin.Float>({ array, index -> array.getDouble(index).toFloat() }, { start, stop, fraction -> start + (stop - start) * fraction }), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
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
      (if (node.has("maxLines")) 8 else 0) +
      (if (node.has("onTextLayout")) 16 else 0)
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
      16 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      17 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      18 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      19 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      20 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      21 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      22 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      23 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      24 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      25 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      26 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      27 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      28 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      29 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      30 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      31 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
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
    val mask = (if (node.has("values")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.runtime.CompositionLocalProvider(
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.runtime.CompositionLocalProvider(
        `values` = *node.arguments().jsonArray("values").toComposeProvidedValues(),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.runtime.CompositionLocalProvider(value: androidx.compose.runtime.ProvidedValue<*>, content: kotlin.Function0<kotlin.Unit>)
internal object RendererCompositionLocalProvider_1 {
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.runtime.CompositionLocalProvider(
      `value` = node.jsonObject("value").toComposeProvidedValue(),
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
      (if (node.has("containerShape")) 4 else 0) +
      (if (node.has("polygons")) 8 else 0)
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
      8 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      9 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      10 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `indicatorColor` = node.color("indicatorColor"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      11 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicatorColor` = node.color("indicatorColor"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      12 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerShape` = node.arguments().shape("containerShape"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      13 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `containerShape` = node.arguments().shape("containerShape"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      14 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `indicatorColor` = node.color("indicatorColor"),
        `containerShape` = node.arguments().shape("containerShape"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      15 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicatorColor` = node.color("indicatorColor"),
        `containerShape` = node.arguments().shape("containerShape"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
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
      (if (node.has("containerShape")) 4 else 0) +
      (if (node.has("polygons")) 8 else 0)
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
      8 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      9 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      10 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `indicatorColor` = node.color("indicatorColor"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      11 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicatorColor` = node.color("indicatorColor"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      12 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerShape` = node.arguments().shape("containerShape"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      13 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `containerShape` = node.arguments().shape("containerShape"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      14 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `indicatorColor` = node.color("indicatorColor"),
        `containerShape` = node.arguments().shape("containerShape"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      15 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicatorColor` = node.color("indicatorColor"),
        `containerShape` = node.arguments().shape("containerShape"),
        `polygons` = node.arguments().jsonArray("polygons").let { items -> List(items.length()) { index -> toComposeMaterialShape(items.getString(index)) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedTextFieldDefaults.Container(enabled: kotlin.Boolean, isError: kotlin.Boolean, interactionSource: androidx.compose.foundation.interaction.InteractionSource, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.TextFieldColors, shape: androidx.compose.ui.graphics.Shape, focusedBorderThickness: androidx.compose.ui.unit.Dp, unfocusedBorderThickness: androidx.compose.ui.unit.Dp)
internal object RendererContainer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("focusedBorderThickness")) 4 else 0) +
      (if (node.has("unfocusedBorderThickness")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
      )
      2 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      5 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      6 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      7 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      8 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      9 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      10 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      11 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      12 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      13 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      14 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      15 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TextFieldDefaults.Container(enabled: kotlin.Boolean, isError: kotlin.Boolean, interactionSource: androidx.compose.foundation.interaction.InteractionSource, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.TextFieldColors, shape: androidx.compose.ui.graphics.Shape, focusedIndicatorLineThickness: androidx.compose.ui.unit.Dp, unfocusedIndicatorLineThickness: androidx.compose.ui.unit.Dp)
internal object RendererContainer_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("focusedIndicatorLineThickness")) 4 else 0) +
      (if (node.has("unfocusedIndicatorLineThickness")) 8 else 0)
    when (mask) {
      4 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      5 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      6 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      7 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      8 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      9 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      10 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      11 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      12 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      13 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      14 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      15 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(enabled: kotlin.Boolean, isError: kotlin.Boolean, interactionSource: androidx.compose.foundation.interaction.InteractionSource, colors: androidx.compose.material3.TextFieldColors, shape: androidx.compose.ui.graphics.Shape, focusedBorderThickness: androidx.compose.ui.unit.Dp, unfocusedBorderThickness: androidx.compose.ui.unit.Dp)
internal object RendererContainerBox {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("focusedBorderThickness")) 4 else 0) +
      (if (node.has("unfocusedBorderThickness")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      1 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
      )
      2 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      5 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      6 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      7 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      8 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      9 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      10 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      11 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      12 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      13 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      14 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      15 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.animation.Crossfade(targetState: T, modifier: androidx.compose.ui.Modifier, animationSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>, label: kotlin.String, content: kotlin.Function1<T, kotlin.Unit>)
internal object RendererCrossfade {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("animationSpec")) 1 else 0) +
      (if (node.has("label")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.animation.Crossfade(
        `targetState` = node.arguments().animationTarget("targetState"),
        `modifier` = node.modifier("modifier", scope),
        content = { state -> RenderComposeAnimationChild(node, state) },
      )
      1 -> androidx.compose.animation.Crossfade(
        `targetState` = node.arguments().animationTarget("targetState"),
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(),
        content = { state -> RenderComposeAnimationChild(node, state) },
      )
      2 -> androidx.compose.animation.Crossfade(
        `targetState` = node.arguments().animationTarget("targetState"),
        `modifier` = node.modifier("modifier", scope),
        `label` = node.string("label"),
        content = { state -> RenderComposeAnimationChild(node, state) },
      )
      3 -> androidx.compose.animation.Crossfade(
        `targetState` = node.arguments().animationTarget("targetState"),
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(),
        `label` = node.string("label"),
        content = { state -> RenderComposeAnimationChild(node, state) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.animation.CustomizedLookaheadAnimationVisualDebugging(debugColor: androidx.compose.ui.graphics.Color, content: kotlin.Function0<kotlin.Unit>)
internal object RendererCustomizedLookaheadAnimationVisualDebugging {
  @OptIn(androidx.compose.animation.ExperimentalLookaheadAnimationVisualDebugApi::class)
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.animation.CustomizedLookaheadAnimationVisualDebugging(
      `debugColor` = node.color("debugColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.material3.DatePicker(state: androidx.compose.material3.DatePickerState, modifier: androidx.compose.ui.Modifier, dateFormatter: androidx.compose.material3.DatePickerFormatter, colors: androidx.compose.material3.DatePickerColors, title: kotlin.Function0<kotlin.Unit>?, headline: kotlin.Function0<kotlin.Unit>?, showModeToggle: kotlin.Boolean, focusRequester: androidx.compose.ui.focus.FocusRequester?)
internal object RendererDatePicker {
  private fun decode_showModeToggle(node: ComposeNode) = node.boolean("showModeToggle")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeDatePickerState() else null
    val content_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val slot_title = if (node.isNull("title")) null else content_title
    val content_headline: @Composable () -> Unit = { RenderComposeChildren(node.slot("headline")) }
    val slot_headline = if (node.isNull("headline")) null else content_headline
    val mask = (if (node.has("dateFormatter")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("title")) 4 else 0) +
      (if (node.has("headline")) 8 else 0) +
      (if (node.has("showModeToggle")) 16 else 0) +
      (if (node.has("focusRequester")) 32 else 0)
    when (mask / 32) {
      0 -> renderDatePickerGroup0(node, scope, mask, stateValue, slot_title, slot_headline)
      1 -> renderDatePickerGroup1(node, scope, mask, stateValue, slot_title, slot_headline)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDatePickerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.DatePickerState?, slot_title: (@Composable () -> Unit)?, slot_headline: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter())
      2 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue())
      3 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue())
      4 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title)
      5 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title)
      6 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title)
      7 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title)
      8 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline)
      9 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline)
      10 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline)
      11 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline)
      12 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline)
      13 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline)
      14 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline)
      15 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline)
      16 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `showModeToggle` = decode_showModeToggle(node))
      17 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `showModeToggle` = decode_showModeToggle(node))
      18 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node))
      19 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node))
      20 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      21 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      22 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      23 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      24 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      25 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      26 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      27 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      28 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      29 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      30 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      31 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDatePickerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.DatePickerState?, slot_title: (@Composable () -> Unit)?, slot_headline: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      33 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      34 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      35 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      36 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      37 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      38 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      39 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      40 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      41 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      42 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      43 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      44 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      45 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      46 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      47 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      48 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      49 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      50 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      51 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      52 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      53 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      54 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      55 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      56 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      57 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      58 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      59 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      60 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      61 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      62 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      63 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DatePickerDialog(onDismissRequest: kotlin.Function0<kotlin.Unit>, confirmButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, dismissButton: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, tonalElevation: androidx.compose.ui.unit.Dp, colors: androidx.compose.material3.DatePickerColors, properties: androidx.compose.ui.window.DialogProperties, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererDatePickerDialog {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("dismissButton")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("properties")) 16 else 0)
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
      8 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DatePickerDefaults.DatePickerHeadline(selectedDateMillis: kotlin.Long?, displayMode: androidx.compose.material3.DisplayMode, dateFormatter: androidx.compose.material3.DatePickerFormatter, modifier: androidx.compose.ui.Modifier, contentColor: androidx.compose.ui.graphics.Color)
internal object RendererDatePickerHeadline {
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
  private fun decode_showModeToggle(node: ComposeNode) = node.boolean("showModeToggle")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeDateRangePickerState() else null
    val content_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val slot_title = if (node.isNull("title")) null else content_title
    val content_headline: @Composable () -> Unit = { RenderComposeChildren(node.slot("headline")) }
    val slot_headline = if (node.isNull("headline")) null else content_headline
    val mask = (if (node.has("dateFormatter")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("title")) 4 else 0) +
      (if (node.has("headline")) 8 else 0) +
      (if (node.has("showModeToggle")) 16 else 0) +
      (if (node.has("focusRequester")) 32 else 0)
    when (mask / 32) {
      0 -> renderDateRangePickerGroup0(node, scope, mask, stateValue, slot_title, slot_headline)
      1 -> renderDateRangePickerGroup1(node, scope, mask, stateValue, slot_title, slot_headline)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDateRangePickerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.DateRangePickerState?, slot_title: (@Composable () -> Unit)?, slot_headline: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter())
      2 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue())
      3 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue())
      4 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title)
      5 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title)
      6 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title)
      7 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title)
      8 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline)
      9 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline)
      10 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline)
      11 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline)
      12 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline)
      13 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline)
      14 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline)
      15 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline)
      16 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `showModeToggle` = decode_showModeToggle(node))
      17 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `showModeToggle` = decode_showModeToggle(node))
      18 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node))
      19 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node))
      20 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      21 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      22 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      23 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      24 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      25 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      26 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      27 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      28 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      29 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      30 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      31 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDateRangePickerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.DateRangePickerState?, slot_title: (@Composable () -> Unit)?, slot_headline: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      33 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      34 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      35 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      36 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      37 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      38 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      39 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      40 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      41 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      42 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      43 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      44 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      45 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      46 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      47 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      48 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      49 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      50 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      51 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      52 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      53 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      54 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      55 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      56 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      57 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      58 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      59 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      60 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      61 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      62 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      63 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline(selectedStartDateMillis: kotlin.Long?, selectedEndDateMillis: kotlin.Long?, displayMode: androidx.compose.material3.DisplayMode, dateFormatter: androidx.compose.material3.DatePickerFormatter, modifier: androidx.compose.ui.Modifier, contentColor: androidx.compose.ui.graphics.Color)
internal object RendererDateRangePickerHeadline {
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

// androidx.compose.material3.TextFieldDefaults.DecorationBox(value: kotlin.String, innerTextField: kotlin.Function0<kotlin.Unit>, enabled: kotlin.Boolean, singleLine: kotlin.Boolean, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, interactionSource: androidx.compose.foundation.interaction.InteractionSource, isError: kotlin.Boolean, label: kotlin.Function0<kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, container: kotlin.Function0<kotlin.Unit>)
internal object RendererDecorationBox {
  private fun decode_value(node: ComposeNode) = node.string("value")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_singleLine(node: ComposeNode) = node.boolean("singleLine")
  private fun decode_isError(node: ComposeNode) = node.boolean("isError")

  @Composable
  fun render(node: ComposeNode) {
    val slot_innerTextField: @Composable () -> Unit = { RenderComposeChildren(node.slot("innerTextField")) }
    val content_label: @Composable () -> Unit = { RenderComposeChildren(node.slot("label")) }
    val slot_label = if (node.isNull("label")) null else content_label
    val content_placeholder: @Composable () -> Unit = { RenderComposeChildren(node.slot("placeholder")) }
    val slot_placeholder = if (node.isNull("placeholder")) null else content_placeholder
    val content_leadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingIcon")) }
    val slot_leadingIcon = if (node.isNull("leadingIcon")) null else content_leadingIcon
    val content_trailingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingIcon")) }
    val slot_trailingIcon = if (node.isNull("trailingIcon")) null else content_trailingIcon
    val content_prefix: @Composable () -> Unit = { RenderComposeChildren(node.slot("prefix")) }
    val slot_prefix = if (node.isNull("prefix")) null else content_prefix
    val content_suffix: @Composable () -> Unit = { RenderComposeChildren(node.slot("suffix")) }
    val slot_suffix = if (node.isNull("suffix")) null else content_suffix
    val content_supportingText: @Composable () -> Unit = { RenderComposeChildren(node.slot("supportingText")) }
    val slot_supportingText = if (node.isNull("supportingText")) null else content_supportingText
    val slot_container: @Composable () -> Unit = { RenderComposeChildren(node.slot("container")) }
    val mask = (if (node.has("isError")) 1 else 0) +
      (if (node.has("label")) 2 else 0) +
      (if (node.has("placeholder")) 4 else 0) +
      (if (node.has("leadingIcon")) 8 else 0) +
      (if (node.has("trailingIcon")) 16 else 0) +
      (if (node.has("prefix")) 32 else 0) +
      (if (node.has("suffix")) 64 else 0) +
      (if (node.has("supportingText")) 128 else 0) +
      (if (node.has("shape")) 256 else 0) +
      (if (node.has("colors")) 512 else 0) +
      (if (node.has("contentPadding")) 1024 else 0) +
      (if (node.has("container")) 2048 else 0)
    when (mask / 32) {
      0 -> renderDecorationBoxGroup0(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      1 -> renderDecorationBoxGroup1(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      2 -> renderDecorationBoxGroup2(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      4 -> renderDecorationBoxGroup4(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      8 -> renderDecorationBoxGroup8(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      16 -> renderDecorationBoxGroup16(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      32 -> renderDecorationBoxGroup32(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      63 -> renderDecorationBoxGroup63(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      64 -> renderDecorationBoxGroup64(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      95 -> renderDecorationBoxGroup95(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      111 -> renderDecorationBoxGroup111(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      119 -> renderDecorationBoxGroup119(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      123 -> renderDecorationBoxGroup123(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      125 -> renderDecorationBoxGroup125(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      126 -> renderDecorationBoxGroup126(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      127 -> renderDecorationBoxGroup127(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup0(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      1 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node))
      2 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label)
      3 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label)
      4 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder)
      5 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder)
      6 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder)
      7 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder)
      8 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon)
      9 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon)
      10 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon)
      11 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon)
      12 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      13 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      14 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      15 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      16 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `trailingIcon` = slot_trailingIcon)
      17 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `trailingIcon` = slot_trailingIcon)
      18 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `trailingIcon` = slot_trailingIcon)
      19 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `trailingIcon` = slot_trailingIcon)
      20 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      21 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      22 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      23 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      24 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      25 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      26 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      27 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      28 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      29 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      30 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      31 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup1(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `prefix` = slot_prefix)
      33 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `prefix` = slot_prefix)
      34 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `prefix` = slot_prefix)
      35 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `prefix` = slot_prefix)
      36 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      37 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      38 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      39 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      40 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      41 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      42 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      43 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      44 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      45 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      46 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      47 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup2(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `suffix` = slot_suffix)
      65 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `suffix` = slot_suffix)
      66 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `suffix` = slot_suffix)
      67 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `suffix` = slot_suffix)
      68 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      69 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      70 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      71 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      72 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      73 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      74 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      75 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      76 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      77 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      78 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      79 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup4(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `supportingText` = slot_supportingText)
      129 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `supportingText` = slot_supportingText)
      130 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `supportingText` = slot_supportingText)
      131 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `supportingText` = slot_supportingText)
      132 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      133 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      134 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      135 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      136 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      137 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      138 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      139 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      140 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      141 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      142 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      143 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup8(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      256 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `shape` = node.arguments().shape("shape"))
      257 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"))
      258 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `shape` = node.arguments().shape("shape"))
      259 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `shape` = node.arguments().shape("shape"))
      260 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      261 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      262 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      263 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      264 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      265 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      266 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      267 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      268 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      269 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      270 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      271 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup16(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      512 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      513 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      514 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      515 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      516 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      517 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      518 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      519 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      520 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      521 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      522 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      523 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      524 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      525 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      526 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      527 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      528 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      529 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      530 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      531 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      532 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      533 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      534 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      535 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      536 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      537 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      538 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      539 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      540 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      541 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      542 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      543 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup32(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      1024 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1025 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1026 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1027 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1028 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1029 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1030 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1031 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1032 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1033 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1034 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1035 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1036 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1037 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1038 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1039 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup63(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      2047 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup64(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      2048 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `container` = slot_container)
      2049 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `container` = slot_container)
      2050 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `container` = slot_container)
      2051 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `container` = slot_container)
      2052 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `container` = slot_container)
      2053 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `container` = slot_container)
      2054 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `container` = slot_container)
      2055 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `container` = slot_container)
      2056 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2057 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2058 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2059 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2060 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2061 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2062 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2063 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup95(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      3071 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup111(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      3583 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup119(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      3839 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup123(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      3967 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup125(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      4031 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup126(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      4063 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup127(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      4079 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4087 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4091 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4093 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4094 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4095 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(value: kotlin.String, innerTextField: kotlin.Function0<kotlin.Unit>, enabled: kotlin.Boolean, singleLine: kotlin.Boolean, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, interactionSource: androidx.compose.foundation.interaction.InteractionSource, isError: kotlin.Boolean, label: kotlin.Function0<kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, container: kotlin.Function0<kotlin.Unit>)
internal object RendererDecorationBox_1 {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("isError")) 1 else 0) +
      (if (node.has("label")) 2 else 0) +
      (if (node.has("placeholder")) 4 else 0) +
      (if (node.has("leadingIcon")) 8 else 0) +
      (if (node.has("trailingIcon")) 16 else 0) +
      (if (node.has("prefix")) 32 else 0) +
      (if (node.has("suffix")) 64 else 0) +
      (if (node.has("supportingText")) 128 else 0) +
      (if (node.has("colors")) 256 else 0) +
      (if (node.has("contentPadding")) 512 else 0) +
      (if (node.has("container")) 1024 else 0)
    when (mask) {
      1023 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1535 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1791 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1919 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1983 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2015 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2031 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2039 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2043 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2045 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2046 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.ui.window.Dialog(onDismissRequest: kotlin.Function0<kotlin.Unit>, properties: androidx.compose.ui.window.DialogProperties, content: kotlin.Function0<kotlin.Unit>)
internal object RendererDialog {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("properties")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.ui.window.Dialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.ui.window.Dialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
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

// androidx.compose.material3.DismissibleDrawerSheet(drawerState: androidx.compose.material3.DrawerState, modifier: androidx.compose.ui.Modifier, drawerShape: androidx.compose.ui.graphics.Shape, drawerContainerColor: androidx.compose.ui.graphics.Color, drawerContentColor: androidx.compose.ui.graphics.Color, drawerTonalElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererDismissibleDrawerSheet_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val drawerStateValue = if (node.has("drawerState") && !node.isNull("drawerState")) node.jsonObject("drawerState").rememberComposeDrawerState(node.arguments()) else null
    val mask = (if (node.has("drawerShape")) 1 else 0) +
      (if (node.has("drawerContainerColor")) 2 else 0) +
      (if (node.has("drawerContentColor")) 4 else 0) +
      (if (node.has("drawerTonalElevation")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.DismissibleDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
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
    val drawerStateValue = if (node.has("drawerState") && !node.isNull("drawerState")) node.jsonObject("drawerState").rememberComposeDrawerState(node.arguments()) else null
    val mask = (if (node.has("drawerState")) 1 else 0) +
      (if (node.has("gesturesEnabled")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DismissibleNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.DismissibleNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `drawerState` = requireNotNull(drawerStateValue),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.DismissibleNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.DismissibleNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `drawerState` = requireNotNull(drawerStateValue),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle(onDisplayModeChange: kotlin.Function0<kotlin.Unit>, displayMode: androidx.compose.material3.TimePickerDisplayMode, modifier: androidx.compose.ui.Modifier)
internal object RendererDisplayModeToggle {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle(
      `onDisplayModeChange` = { node.emit("onDisplayModeChange") },
      `displayMode` = toComposeTimePickerDisplayMode(node.string("displayMode")),
      `modifier` = node.modifier("modifier", scope),
    )
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
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("shadowElevation")) 8 else 0)
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
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
