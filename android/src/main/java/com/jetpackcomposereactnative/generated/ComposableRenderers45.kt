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

// androidx.compose.material3.VerticalSlider(state: androidx.compose.material3.SliderState, onValueChange: kotlin.Function1<kotlin.Float, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, onValueChangeFinished: kotlin.Function0<kotlin.Unit>?, topToBottom: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource, thumb: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>, track: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>)
internal object RendererVerticalSlider {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_topToBottom(node: ComposeNode) = node.boolean("topToBottom")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("onValueChangeFinished")) 2 else 0) +
      (if (node.has("topToBottom")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0) +
      (if (node.has("thumb")) 32 else 0) +
      (if (node.has("track")) 64 else 0)
    when (mask / 32) {
      0 -> renderVerticalSliderGroup0(node, scope, mask)
      1 -> renderVerticalSliderGroup1(node, scope, mask)
      2 -> renderVerticalSliderGroup2(node, scope, mask)
      3 -> renderVerticalSliderGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalSliderGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      3 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      4 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node))
      5 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node))
      6 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node))
      7 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node))
      8 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      9 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      10 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      11 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      12 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      13 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      14 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      15 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      16 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      17 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      18 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      19 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      20 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      21 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      22 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      23 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      24 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      25 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      26 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      27 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      28 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      29 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      30 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      31 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalSliderGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      33 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      34 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      35 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      36 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      37 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      38 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      39 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      40 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      41 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      42 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      43 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      44 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      45 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      46 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      47 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      48 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      49 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      50 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      51 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      52 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      53 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      54 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      55 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      56 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      57 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      58 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      59 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      60 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      61 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      62 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      63 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalSliderGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      65 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      66 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      67 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      68 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      69 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      70 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      71 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      72 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      73 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      74 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      75 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      76 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      77 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      78 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      79 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      80 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      81 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      82 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      83 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      84 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      85 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      86 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      87 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      88 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      89 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      90 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      91 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      92 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      93 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      94 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      95 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalSliderGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      97 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      98 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      99 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      100 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      101 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      102 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      103 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      104 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      105 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      106 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      107 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      108 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      109 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      110 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      111 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      112 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      113 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      114 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      115 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      116 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      117 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      118 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      119 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      120 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      121 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      122 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      123 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      124 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      125 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      126 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      127 -> androidx.compose.material3.VerticalSlider(`state` = node.jsonObject("state").rememberComposeSliderHandle(), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `topToBottom` = decode_topToBottom(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `thumb` = { argument -> RenderComposeChildren(node.slot("thumb"), argument) }, `track` = { argument -> RenderComposeChildren(node.slot("track"), argument) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererVibrantFloatingActionButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
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

// androidx.compose.material3.VibrantTimePickerDialog(onDismissRequest: kotlin.Function0<kotlin.Unit>, confirmButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, properties: androidx.compose.ui.window.DialogProperties, modeToggleButton: kotlin.Function0<kotlin.Unit>?, dismissButton: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererVibrantTimePickerDialog {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("properties")) 1 else 0) +
      (if (node.has("modeToggleButton")) 2 else 0) +
      (if (node.has("dismissButton")) 4 else 0) +
      (if (node.has("shape")) 8 else 0) +
      (if (node.has("containerColor")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.VibrantTimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.WideNavigationRail(modifier: androidx.compose.ui.Modifier, state: androidx.compose.material3.WideNavigationRailState, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.WideNavigationRailColors, header: kotlin.Function0<kotlin.Unit>?, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.foundation.layout.Arrangement.Vertical, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function0<kotlin.Unit>)
internal object RendererWideNavigationRail {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeWideNavigationRailState(node.arguments()) else null
    val content_header: @Composable () -> Unit = { RenderComposeChildren(node.slot("header")) }
    val slot_header = if (node.isNull("header")) null else content_header
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("header")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0) +
      (if (node.has("arrangement")) 32 else 0) +
      (if (node.has("contentPadding")) 64 else 0)
    when (mask / 32) {
      0 -> renderWideNavigationRailGroup0(node, scope, mask, stateValue, renderChildren, slot_header)
      1 -> renderWideNavigationRailGroup1(node, scope, mask, stateValue, renderChildren, slot_header)
      2 -> renderWideNavigationRailGroup2(node, scope, mask, stateValue, renderChildren, slot_header)
      3 -> renderWideNavigationRailGroup3(node, scope, mask, stateValue, renderChildren, slot_header)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderWideNavigationRailGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = renderChildren)
      2 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = renderChildren)
      3 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), content = renderChildren)
      4 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      5 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      6 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      7 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      8 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, content = renderChildren)
      9 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, content = renderChildren)
      10 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `header` = slot_header, content = renderChildren)
      11 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `header` = slot_header, content = renderChildren)
      12 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      13 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      14 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      15 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      16 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      17 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      18 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      19 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      20 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      21 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      22 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      23 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      24 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      25 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      26 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      27 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      28 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      29 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      30 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      31 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderWideNavigationRailGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      33 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      34 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      35 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      36 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      37 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      38 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      39 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      40 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      41 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      42 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      43 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      44 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      45 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      46 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      47 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      48 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      49 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      50 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      51 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      52 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      53 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      54 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      55 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      56 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      57 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      58 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      59 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      60 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      61 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      62 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      63 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderWideNavigationRailGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      65 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      66 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      67 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      68 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      69 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      70 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      71 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      72 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      73 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      74 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      75 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      76 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      77 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      78 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      79 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      80 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      81 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      82 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      83 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      84 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      85 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      86 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      87 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      88 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      89 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      90 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      91 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      92 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      93 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      94 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      95 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderWideNavigationRailGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      97 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      98 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      99 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      100 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      101 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      102 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      103 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      104 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      105 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      106 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      107 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      108 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      109 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      110 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      111 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      112 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      113 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      114 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      115 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      116 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      117 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      118 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      119 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      120 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      121 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      122 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      123 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      124 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      125 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      126 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      127 -> androidx.compose.material3.WideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.WideNavigationRailItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>?, railExpanded: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, iconPosition: androidx.compose.material3.NavigationItemIconPosition, colors: androidx.compose.material3.NavigationItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, indicatorPadding: androidx.compose.foundation.layout.PaddingValues)
internal object RendererWideNavigationRailItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("iconPosition")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0) +
      (if (node.has("indicatorPadding")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
      )
      3 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
      )
      4 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      5 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      6 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      7 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      8 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      9 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      10 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      11 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      12 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      13 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      14 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      15 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      16 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      17 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      18 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      19 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      20 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      21 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      22 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      23 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      24 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      25 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      26 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      27 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      28 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      29 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      30 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      31 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `railExpanded` = node.boolean("railExpanded"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `indicatorPadding` = node.jsonObject("indicatorPadding").toPaddingValues(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
